"""
Entity Loot Table Creator

This script creates JSON loot tables for entities dropping one item (their carcase) based on a YAML file and saves them to the specified output directory.

Usage:
    python create_entity_tables.py <yaml_file> <output_dir>

Args:
    yaml_file (str): Path to the input YAML file containing a list of entities.
    output_dir (str): Directory to save the generated JSON loot tables.

Examples:
    - YAML file:
        loot_tables:
          bee:
            - bee 
          donkey:
            - donkey
          mule:
            - mule
          horse:
            - horse
          camel:
            - camel 
          llama:
            - llama
            - trader_llama
          cat:
            - cat
            - ocelot
          meatless_equine:
            - skeleton_horse

    - Command:
        python create_entity_tables.py entities.yaml loot_tables

    - Output:
        - loot_tables/bee.json
        - loot_tables/donkey.json
        - loot_tables/mule.json
        - loot_tables/horse.json
        - loot_tables/camel.json
        - loot_tables/llama.json
        - loot_tables/cat.json
        - loot_tables/skeleton_horse.json
"""

import json
import os
import argparse
import yaml

def delete(path: str = None):
    """
    Deletes the file specified.

    Args:
        path (str): The path of the file to delete
    
    Returns:
        None
    """
    if os.path.exists(path):
        print(f"Deleting file: {path}")
        os.remove(path)
    else:
        print(f"Could not find file: {path}")

def create_entity_loot_table(entities, output_dir, config_file):
    """
    Create JSON loot tables for entities dropping one item (their carcase) and save them to the output directory.

    Args:
        entities (dict): Dictionary containing entities and their associated carcases.
        output_dir (str): Output directory to save JSON loot tables.
        config_file (str): Config file containing the script deletion configuration

    Returns:
        None
    """
    for entity, carcases in entities.items():
        for carcase in carcases:
            output_file = os.path.join(output_dir, f"{carcase}.json")
            over = False
            if os.path.exists(output_file):
                over =  True

            loot_table = {
                "type": "minecraft:entity",
                "pools": [
                    {
                        "rolls": 1.0,
                        "bonus_rolls": 0.0,
                        "entries": [
                            {
                                "type": "minecraft:item",
                                "name": f"tsm:{entity}_carcase",
                                "functions": [
                                    {
                                        "function": "minecraft:set_count",
                                        "count": 1.0,
                                        "add": False
                                    }
                                ]
                            }
                        ]
                    }
                ],
                "random_sequence": f"minecraft:entities/{carcase}"
            }

            if yaml.safe_load(open(config_file))['script_deletion']['create_entity_tables.py']:
                if over: print(f"Overwriting existing file: {output_file}")
                else: print(f"Creating loot table: {output_file}")
                
                # Write the updated JSON data to the output file
                with open(output_file, 'w') as outfile:
                    json.dump(loot_table, outfile, indent=2)
            else:
                delete(output_file)

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Create JSON loot tables for entities dropping one item (their carcase)")
    parser.add_argument("yaml_file", help="Input YAML file containing a list of entities")
    parser.add_argument("output_dir", help="Output directory to save JSON loot tables")
    parser.add_argument("config_yaml", help="Yaml config file containing the script deletion configuration")
    args = parser.parse_args()

    yaml_file = args.yaml_file
    output_dir = args.output_dir
    config_file = args.config_yaml

    if not os.path.exists(output_dir):
        os.makedirs(output_dir)

    with open(yaml_file, 'r') as stream:
        try:
            data = yaml.safe_load(stream)
            entities = data.get("loot_tables", [])
            create_entity_loot_table(entities, output_dir, config_file)
        except yaml.YAMLError as exc:
            print(exc)
