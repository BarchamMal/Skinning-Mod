import json
import os
import argparse
import yaml

def create_entity_loot_table(entities, output_dir):
    for entity in entities:
        output_file = os.path.join(output_dir, f"{entity}.json")
        if os.path.exists(output_file):
            print(f"Skipping existing file: {output_file}")
            continue

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
            "random_sequence": f"minecraft:entities/{entity}"
        }

        with open(output_file, 'w') as outfile:
            json.dump(loot_table, outfile, indent=2)
        print(f"Created loot table: {output_file}")

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Create JSON loot tables for entities dropping one item (their carcase)")
    parser.add_argument("yaml_file", help="Input YAML file containing a list of entities")
    parser.add_argument("output_dir", help="Output directory to save JSON loot tables")
    args = parser.parse_args()

    yaml_file = args.yaml_file
    output_dir = args.output_dir

    if not os.path.exists(output_dir):
        os.makedirs(output_dir)

    with open(yaml_file, 'r') as stream:
        try:
            data = yaml.safe_load(stream)
            entities = data.get("loot_tables", [])
            create_entity_loot_table(entities, output_dir)
        except yaml.YAMLError as exc:
            print(exc)
