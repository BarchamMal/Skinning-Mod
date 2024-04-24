import os
import yaml
import argparse
import json

def create_item_models(yaml_file, output_dir):
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

                with open(output_file, 'w') as outfile:
                    json.dump(item_model, outfile, indent=2)
                if over: print(f"Overwriting existing file: {output_file}")
                else: print(f"Created item model: {output_file}")
        except yaml.YAMLError as exc:
            print(exc)

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Create simple item models from a YAML list")
    parser.add_argument("yaml_file", help="Input YAML file containing a list of item names")
    parser.add_argument("output_dir", help="Output directory to save item models")
    args = parser.parse_args()

    yaml_file = args.yaml_file
    output_dir = args.output_dir

    if not os.path.exists(output_dir):
        os.makedirs(output_dir)

    create_item_models(yaml_file, output_dir)
