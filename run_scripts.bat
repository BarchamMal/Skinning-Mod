@echo off

REM Script Name: run_scripts.bat
REM Description: This script automates the process of creating models, recipe
REM              advancements, and loot tables for a Minecraft mod project.
REM Author: BarchamMal
REM Date: 2024-04-24
REM Version: 1.1

REM Change directory to the location of the script
cd /d "%~dp0"

REM Create the models
echo Starting Models:
echo -------------------------------------Carcases-------------------------------------
python src\main\resources\assets\tsm\models\auto\create_carcases.py src\main\resources\assets\tsm\models\auto\carcases.yaml src\main\resources\assets\tsm\models\item src\config.yaml
echo -------------------------------------Simple Items-------------------------------------
python src\main\resources\assets\tsm\models\auto\create_simple_items.py src\main\resources\assets\tsm\models\auto\items.yaml src\main\resources\assets\tsm\models\item src\config.yaml

REM Create the recipe advancements
echo Starting Recipes
echo -------------------------------------Advancements-------------------------------------
python src\main\resources\data\minecraft\advancements\recipes\auto\make_recipe_advancements.py src\main\resources\data\minecraft\advancements\recipes\auto\cooked_food.json src\main\resources\data\minecraft\advancements\recipes\auto\foods.yaml src\main\resources\data\minecraft\advancements\recipes\food src\config.yaml
echo -------------------------------------Recipes-------------------------------------
python src\main\resources\data\minecraft\advancements\recipes\auto\make_recipe_advancements.py src\main\resources\data\tsm\auto\cooked_food.json src\main\resources\data\minecraft\advancements\recipes\auto\foods.yaml src\main\resources\data\tsm\recipes src\config.yaml

REM Create the loot tables
echo Starting Loot Tables
echo -------------------------------------Entities-------------------------------------
python src\main\resources\data\minecraft\loot_tables\auto\create_entity_tables.py src\main\resources\data\minecraft\loot_tables\auto\mobs.yml src\main\resources\data\minecraft\loot_tables\entities src\config.yaml
echo -------------------------------------Carcases-------------------------------------
python src\main\resources\data\tsm\loot_tables\auto\loot_table_generator.py src\main\resources\data\tsm\loot_tables\auto\loot_tables.yaml src\main\resources\data\tsm\loot_tables\carcases src\config.yaml
