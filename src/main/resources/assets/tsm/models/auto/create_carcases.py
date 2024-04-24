import os
import yaml
import argparse
import json

def create_item_models(yaml_file, output_dir):
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
                        "texture_size": [64, 32],
                        "textures": {
                            "0": f"tsm:item/carcase/{item_data['category']}/{item_name}"
                        }
                    }

                    with open(output_file, 'w') as outfile:
                        json.dump(item_model, outfile, indent=2)
            
                    if over: print(f"Overwriting existing file: {output_file}")
                    else: print(f"Created carcase model: {output_file}")
        except yaml.YAMLError as exc:
            print(exc)

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Create item models from a YAML dictionary")
    parser.add_argument("yaml_file", help="Input YAML file containing dictionaries of item names")
    parser.add_argument("output_dir", help="Output directory to save item models")
    args = parser.parse_args()

    yaml_file = args.yaml_file
    output_dir = args.output_dir

    if not os.path.exists(output_dir):
        os.makedirs(output_dir)

    create_item_models(yaml_file, output_dir)
