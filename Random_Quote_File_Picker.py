def get_random_quote():
    files = os.listdir('quotes')
    random_file = random.choice(files)