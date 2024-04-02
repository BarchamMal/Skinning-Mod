
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
sausage
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