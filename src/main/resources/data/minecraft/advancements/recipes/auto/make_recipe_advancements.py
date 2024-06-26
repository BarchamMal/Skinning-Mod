"""
Recipe and Advancement Updater

This script updates recipe and advancement files based on food items. It takes a template file containing JSON data for recipes or advancements,
a YAML file containing a list of food items, and an output directory to save the updated JSON files.

Usage:
    python make_recipe_advancements.py <template> <foods_yaml> <output_dir>

Args:
    template (str): Path to the template file containing JSON data for recipes or advancements.
    foods_yaml (str): Path to the YAML file containing the list of food items.
    output_dir (str): Directory to save the updated JSON files.

Example:
    python make_recipe_advancements.py template.json foods.yaml updated_files
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

def update_recipe_files(template, foods_yaml, output_dir, config_file):
    """
    Update recipe and advancement files based on food items.

    Args:
        template (str): Path to the template file containing JSON data for recipes or advancements.
        foods_yaml (str): Path to the YAML file containing the list of food items.
        output_dir (str): Directory to save the updated JSON files.
        config_file (str): Config file containing the script deletion configuration
    """
    # Read the list of food items from the YAML file
    with open(foods_yaml, 'r') as yaml_file:
        foods = yaml.safe_load(yaml_file)
    
    if not os.path.exists(output_dir):
        os.mkdir(output_dir)

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
                over = True

            if yaml.safe_load(open(config_file))['script_deletion']['make_recipe_advancements.py']:
                if over: print(f"Overwriting existing file: {output_file}")
                else: print(f"Creating recipe or advancement: {output_file}")
                
                # Write the updated JSON data to the output file
                with open(output_file, 'w') as outputfile:
                    outputfile.write(file)
            else:
                delete(output_file)

            i+=1

if __name__ == "__main__":
    # Parse command-line arguments
    parser = argparse.ArgumentParser(description="Update recipe and advancement files based on food items")
    parser.add_argument("template", help="Path to the template file containing JSON data for recipes or advancements")
    parser.add_argument("foods", help="Path to the YAML file containing the list of food items")
    parser.add_argument("output_dir", help="Output directory to save updated JSON files")
    parser.add_argument("config_yaml", help="Yaml config file containing the script deletion configuration")
    args = parser.parse_args()

    # Call the function to update recipe and advancement files
    update_recipe_files(args.template, args.foods, args.output_dir, args.config_yaml)
