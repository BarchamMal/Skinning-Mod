import json
import os
import argparse
import yaml

def update_recipe_files(template, foods_yaml, output_dir):
    # Read the list of food items from the YAML file
    with open(foods_yaml, 'r') as yaml_file:
        foods = yaml.safe_load(yaml_file)

    # The list of template file names for export
    template_files = [
        "_from_campfire_cooking.json",
        "_from_smoking.json",
        ".json"
    ]
    craft_types = [
        "campfire_cooking",
        "smoking",
        "smelting"
    ]
    craft_times = [
        "600",
        "100",
        "200"
    ]

    # Iterate over each food item and each template file
    for food in foods['foods']:
        i = 0
        for template_file in template_files:
            # Read the template JSON file
            file = open(template).read()
            
            # Update the template with the current food item
            file = file.replace("<food>", f"{food}")
            file = file.replace("<cook>", template_file.split('.')[0])
            file = file.replace("<craft>", craft_types[i])
            file = file.replace("<time>", craft_times[i])
            
            # Construct the output file name
            output_file = os.path.join(output_dir, f"cooked_{food}{template_file}")

            # Check if the output file already exists
            over = False
            if os.path.exists(output_file):
                over =  True

            # Write the updated JSON data to the output file
            with open(output_file, 'w') as outputfile:
                outputfile.write(file)

            if over: print(f"Overwriting existing file: {output_file}")
            else: print(f"Created recipe or advancement: {output_file}")

            i+=1

if __name__ == "__main__":
    # Parse command-line arguments
    parser = argparse.ArgumentParser(description="Update recipe files based on food items")
    parser.add_argument("template", help="Folder containing template JSON files")
    parser.add_argument("foods", help="YAML file containing the list of food items")
    parser.add_argument("output_dir", help="Output directory to save updated JSON files")
    args = parser.parse_args()

    # Call the function to update recipe files
    update_recipe_files(args.template, args.foods, args.output_dir)
