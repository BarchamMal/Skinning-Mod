"""
Carcase Item Model Creator

This script creates carcase item models based on a YAML dictionary and saves them to the specified output directory.

Usage:
    python create_carcases.py <yaml_file> <output_dir>

Args:
    yaml_file (str): Path to the input YAML file containing dictionaries of item names and categories.
    output_dir (str): Directory to save the generated carcase item models.

Examples:
    - YAML file:
        t_b_c:
          bee_exoskeleton:
            category: bee
          shelled_bee_carcase:
            category: bee
          bee_carcase:
            category: bee
        t_h_c:
          meatless_equine_carcase:
            category: equine
          skinless_equine_carcase:
            category: equine
          horse_carcase:
            category: equine
          donkey_carcase:
            category: equine
          mule_carcase:
            category: equine

    - Command:
        python create_carcases.py carcases.yaml models/carcases

    - Output:
        - models/carcases/bee_exoskeleton.json
        - models/carcases/shelled_bee_carcase.json
        - models/carcases/bee_carcase.json
        - models/carcases/meatless_equine_carcase.json
        - models/carcases/skinless_equine_carcase.json
        - models/carcases/horse_carcase.json
        - models/carcases/donkey_carcase.json
        - models/carcases/mule_carcase.json
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

def create_carcase_models(yaml_file, output_dir, config_file):
    """
    Create carcase item models from a YAML dictionary and save them to the output directory.

    Args:
        yaml_file (str): Path to the input YAML file containing dictionaries of item names and categories.
        output_dir (str): Output directory to save carcase item models.
        config_file (str): Config file containing the script deletion configuration.

    Returns:
        None
    """
    with open(yaml_file, 'r') as stream:
        try:
            data = yaml.safe_load(stream)
            for category, items in data.items():
                for item_name, item_data in items.items():
                    output_file = os.path.join(output_dir, f"{item_name}.json")
                    over = False
                    if os.path.exists(output_file):
                        over =  True

                    item_model = {
                        "credit": "Made with Blockbench",
                        "parent": f"tsm:item/{category}",
                        "textures": {
                            "0": f"tsm:item/carcase/{item_data['category']}/{item_name}"
                        }
                    }

                    if yaml.safe_load(open(config_file))['script_deletion']['create_carcases.py']:
                        if over:
                            print(f"Overwriting existing file: {output_file}")
                        else:
                            print(f"Creating carcase model: {output_file}")
                        with open(output_file, 'w') as outfile:
                            outfile.write(json.dumps(item_model, indent=2))
                    else:
                        delete(output_file)
        except yaml.YAMLError as exc:
            print(exc)

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Create item models from a YAML dictionary")
    parser.add_argument("yaml_file", help="Input YAML file containing dictionaries of item names and categories")
    parser.add_argument("output_dir", help="Output directory to save carcase item models")
    parser.add_argument("config_file", help="Config file containing the script deletion configuration")
    args = parser.parse_args()

    yaml_file = args.yaml_file
    output_dir = args.output_dir
    config_file = args.config_file

    if not os.path.exists(output_dir):
        os.makedirs(output_dir)

    create_carcase_models(yaml_file, output_dir, config_file)
    