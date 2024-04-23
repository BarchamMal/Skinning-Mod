
dirs = [
    "cooked_food_from_campfire_cooking.json",
    "cooked_food_from_smoking.json",
    "cooked_food.json",
]

folder: list = __file__.split('/')
folder.pop(-1)
folder.pop(-1)
folder.pop(0)

first = True

for path in folder:

    if first:
        folder = path
        first = False
    else:
        folder = folder + '/' + path


folder = '/' + folder + '/'

foodFolder = "food/"

foods = """
chicken_leg,
chicken_wing,
ground_beef,
ground_mutton,
ground_pork,
liver,
rib,
tongue,
sausage,
salmon_steak,
cod_steak,
tropical_fish_steak,
pufferfish_steak,
poison_fish_steak,
glow_squid_tentacle,
squid_tentacle,
bear_steak,
ground_bear,
turtle_steak,
bee_steak,
cooked_bee_steak,
camel_steak,
cooked_camel_steak,
cat_meat,
cooked_cat_meat,
equine_steak,
cooked_equine_steak,
llama_steak,
cooked_llama_steak
""".replace("\n", "").split(',')

for food in foods:
    for dir in dirs:

        file = open(folder + dir)
        text = file.read()
        text = text.replace("has_food", "has_"+food)
        text = text.replace("cooked_food", "tsm:cooked_"+food)
        text = text.replace("food", "tsm:"+food)
        name = dir.replace("food", food)

        save = open(folder + foodFolder + name, "w")
        save.write(text)