"""
YAML to JSON Loot Table Converter

This script converts YAML loot table data to JSON loot tables. It can handle the following loot table formats:
- Single item quantity
- Min-max quantity range
- Rare drops with very low chance
- MultiItem type

Usage:
    python yaml_to_json.py <yaml_file> <output_dir>

Args:
    yaml_file (str): Path to the input YAML file containing loot table data.
    output_dir (str): Directory to save the generated JSON loot tables.

Examples:
    - Single item quantity:
        skeleton_carcase:
          minecraft:arrow: 5
          minecraft:bone: 2

    - Min-max quantity range:
        zombie_carcase:
          minecraft:rotten_flesh: [2, 5]
          minecraft:iron_ingot: [0, 1]

    - Rare drops with very low chance:
        rare_skeleton_carcase:
          minecraft:arrow: 1
          minecraft:bone: "minecraft:arrow"

    - MultiItem type:
        woolly_hide:
          multi_wool:
            count: 8
            types:
              - 'minecraft:white_wool'
              - 'minecraft:black_wool'
              - 'minecraft:brown_wool'
              - 'minecraft:gray_wool'
"""

import json
import os
import yaml
import argparse
from typing import List

def delete(path: str = None):
    """
    Deletes the file specified.

    Args:
        path (str): The path of the file to delete
    
    Returns:
        None
    """
    return
    os.remove(path)

def single_table(item_name: str, count: int) -> dict:
    """
    Create a pool for a single item quantity loot table.

    Args:
        item_name (str): The name of the item.
        count (int): The quantity of the item.
    
    Returns:
        dict: The JSON pool structure for the loot table.
    """

    pool = {
        "rolls": 1,
        "entries": [
            {
                "type": "minecraft:item",
                "name": item_name,
                "weight": 1,
                "functions": [
                    {
                        "function": "minecraft:set_count",
                        "count": {
                            "min": count,
                            "max": count
                        }
                    }
                ]
            }
        ]
    }
    return pool

def rare_table(item_name: str, count: str) -> dict:
    """
    Create a pool for a rare drops with very low chance loot table.

    Args:
        item_name (str): The name of the key item.
        count (str): The name of the value item.
    
    Returns:
        dict: The JSON pool structure for the loot table.
    """
    rare_pool = {
        "rolls": 1,
        "entries": [
            {
                "type": "minecraft:item",
                "name": item_name,
                "weight": 1,  # Weight of the key item
                "functions": [
                    {
                        "function": "minecraft:set_count",
                        "count": {
                            "min": 1,
                            "max": 1
                        }
                    }
                ]
            },
            {
                "type": "minecraft:item",
                "name": count,  # Value item
                "weight": 25,  # Weight for the value item to drop
                "functions": [
                    {
                        "function": "minecraft:set_count",
                        "count": {
                            "min": 1,
                            "max": 1
                        }
                    }
                ]
            }
        ]
    }
    return rare_pool

def multi_item_table(item_name: str, count: dict) -> dict:
    """
    Create a pool for a MultiItem type loot table.

    Args:
        item_name (str): The name of the item.
        count (dict): The count and types of the items.
    
    Returns:
        dict: The JSON pool structure for the loot table.
    """
    multi_item_pool = {
        "rolls": 1,
        "entries": [],
        "_comment": "Part of " + item_name
    }
    for item_type in count['types']:
        multi_item_pool['entries'].append({
            "type": "minecraft:item",
            "name": item_type,
            "weight": 1,
            "functions": [
                {
                    "function": "minecraft:set_count",
                    "count": {
                        "min": count['count'],
                        "max": count['count']
                    }
                }
            ]
        })
    return multi_item_pool

def min_max_table(item_name: str, count: list) -> dict:
    """
    Create a pool for a min-max quantity range loot table.

    Args:
        item_name (str): The name of the item.
        count (list): The range of quantity for the item.
    
    Returns:
        dict: The JSON pool structure for the loot table.
    """
    min_count = count[0]
    max_count = count[1]

    pool = {
        "rolls": 1,
        "entries": [
            {
                "type": "minecraft:item",
                "name": item_name,
                "weight": 1,
                "functions": [
                    {
                        "function": "minecraft:set_count",
                        "count": {
                            "min": min_count,
                            "max": max_count
                        }
                    }
                ]
            }
        ]
    }
    return pool

def create_loot_table(yaml_file: str, output_dir: str):
    """
    Convert YAML loot table data to JSON loot tables.

    Args:
        yaml_file (str): Path to the input YAML file containing loot table data.
        output_dir (str): Directory to save the generated JSON loot tables.

    Returns:
        None
    """
    with open(yaml_file, 'r') as stream:
        try:
            data = yaml.safe_load(stream)
            for key, value in data.items():
                output_file = os.path.join(output_dir, f"{key}.json")
                
                # Check if the output file already exists
                over = False
                if os.path.exists(output_file):
                    over =  True

                loot_table = {
                    "type": "minecraft:loot_table",
                    "pools": []
                }
                for item_name, count in value.items():
                    if isinstance(count, dict) and 'types' in count:
                        pool = multi_item_table(item_name, count)
                    elif isinstance(count, list):
                        if len(count) == 2:
                            pool = min_max_table(item_name, count)
                        else:
                            pool = single_table(item_name, count[0])
                    elif ":" in str(count):
                        pool = rare_table(item_name, count)
                    elif isinstance(count, int):
                        pool = single_table(item_name, count)
                    
                    loot_table["pools"].append(pool)
                
                with open(output_file, 'w') as outfile:
                    json.dump(loot_table, outfile, indent=2)
                if over: print(f"Overwriting existing file: {output_file}")
                else: print(f"Created loot table: {output_file}")
                delete(output_file)
        except yaml.YAMLError as exc:
            print(exc)

if __name__ == "__main__":
    # Parse command line arguments
    parser = argparse.ArgumentParser(description="Convert YAML to JSON loot tables")
    parser.add_argument("yaml_file", help="Input YAML file containing loot table data")
    parser.add_argument("output_dir", help="Output directory to save JSON loot tables")
    args = parser.parse_args()

    yaml_file = args.yaml_file
    output_dir = args.output_dir

    # Create the output directory if it doesn't exist
    if not os.path.exists(output_dir):
        os.makedirs(output_dir)

    # Convert YAML loot tables to JSON
    create_loot_table(yaml_file, output_dir)
