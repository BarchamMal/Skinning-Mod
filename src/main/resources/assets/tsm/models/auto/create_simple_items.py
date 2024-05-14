"""
Simple Item Model Creator

This script creates simple generated item models based on a YAML list of item names and saves them to the specified output directory.

Usage:
    python create_simple_items.py <yaml_file> <output_dir>

Args:
    yaml_file (str): Path to the input YAML file containing a list of item names.
    output_dir (str): Directory to save the generated item models.

Examples:
    - YAML file:
        sword
        shield
        pickaxe
        axe

    - Command:
        python create_simple_items.py items.yaml models/items

    - Output:
        - models/items/sword.json
        - models/items/shield.json
        - models/items/pickaxe.json
        - models/items/axe.json
"""

import os
import yaml
import argparse
import json

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

def create_item_models(yaml_file, output_dir, config_file):
    """
    Create simple item models from a YAML list and save them to the output directory.

    Args:
        yaml_file (str): Path to the input YAML file containing a list of item names.
        output_dir (str): Output directory to save item models.
        config_file (str): Config file containing the script deletion configuration

    Returns:
        None
    """
    with open(yaml_file, 'r') as stream:
        try:
            data = yaml.safe_load(stream)
            for item_name in data:
                output_file = os.path.join(output_dir, f"{item_name}.json")
                over = False
                if os.path.exists(output_file):
                    over =  True

                item_model = {
                    "parent": "minecraft:item/generated",
                    "textures": {
                        "layer0": f"tsm:item/{item_name}"
                    }
                }

                if yaml.safe_load(open(config_file))['script_deletion']['create_simple_items.py']:
                    if over: 
                        print(f"Overwriting existing file: {output_file}")
                    else: 
                        print(f"Creating item model: {output_file}")

                    with open(output_file, 'w') as outfile:
                        json.dump(item_model, outfile, indent=2)
                else:
                    delete(output_file)
        except yaml.YAMLError as exc:
            print(exc)

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Create simple item models from a YAML list")
    parser.add_argument("yaml_file", help="Input YAML file containing a list of item names")
    parser.add_argument("output_dir", help="Output directory to save item models")
    parser.add_argument("config_yaml", help="Yaml config file containing the script deletion configuration")
    args = parser.parse_args()

    yaml_file = args.yaml_file
    output_dir = args.output_dir
    config_file = args.config_yaml

    if not os.path.exists(output_dir):
        os.makedirs(output_dir)

    create_item_models(yaml_file, output_dir, config_file)
