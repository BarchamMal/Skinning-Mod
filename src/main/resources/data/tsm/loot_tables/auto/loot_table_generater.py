"""
YAML to JSON Loot Table Converter

This script converts YAML loot table data to JSON loot tables. It can handle the following loot table formats:
- Single item quantity
- Min-max quantity range
- Rare drops with very low chance

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
"""

import json
import os
import yaml
import argparse

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

def create_loot_table(yaml_file, output_dir):
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
                    min_count = count[0] if isinstance(count, list) else count
                    max_count = count[1] if isinstance(count, list) else count

                    # Check if the value is another item
                    if ":" in str(count):
                        # Create a rare pool with a chance for the value item to drop
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
                        loot_table["pools"].append(rare_pool)
                        continue

                    # Create a pool for the key item
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
