#!/bin/bash

################################################################################
# Script Name: run_scripts.sh
# Description: This script automates the process of creating models, recipe
#              advancements, and loot tables for a Minecraft mod project.
# Author: BarchamMal
# Date: 2024-04-24
# Version: 1.0
################################################################################

# Change directory to the location of the script
cd "${0%/*}"

# Create the models
echo "Starting Models:"
echo "-------------------------------------Carcases-------------------------------------"
python3 src/main/resources/assets/tsm/models/auto/create_carcases.py src/main/resources/assets/tsm/models/auto/carcases.yaml src/main/resources/assets/tsm/models/item
echo "-------------------------------------Simple Items-------------------------------------"
python3 src/main/resources/assets/tsm/models/auto/create_simple_items.py src/main/resources/assets/tsm/models/auto/items.yaml src/main/resources/assets/tsm/models/item

# Create the recipe advancements
echo "Starting Recipes"
echo "-------------------------------------Advancements-------------------------------------"
python3 src/main/resources/data/minecraft/advancements/recipes/auto/make_recipe_advancements.py src/main/resources/data/minecraft/advancements/recipes/auto/cooked_food.json src/main/resources/data/minecraft/advancements/recipes/auto/foods.yaml src/main/resources/data/minecraft/advancements/recipes/food
echo "-------------------------------------Recipes-------------------------------------"
python3 src/main/resources/data/minecraft/advancements/recipes/auto/make_recipe_advancements.py src/main/resources/data/tsm/auto/cooked_food.json src/main/resources/data/minecraft/advancements/recipes/auto/foods.yaml src/main/resources/data/tsm/recipes

# Create the loot tables
echo "Starting Loot Tables"
echo "-------------------------------------Entities-------------------------------------"
python3 src/main/resources/data/minecraft/loot_tables/auto/create_entity_tables.py src/main/resources/data/minecraft/loot_tables/auto/mobs.yml src/main/resources/data/minecraft/loot_tables/entities
echo "-------------------------------------Carcases-------------------------------------"
python3 src/main/resources/data/tsm/loot_tables/auto/loot_table_generator.py src/main/resources/data/tsm/loot_tables/auto/loot_tables.yaml src/main/resources/data/tsm/loot_tables/carcases
