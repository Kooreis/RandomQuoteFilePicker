```python
import os
import random

def get_random_quote():
    files = os.listdir("quotes")
    random_file = random.choice(files)
    with open(f"quotes/{random_file}", "r") as file:
        lines = file.readlines()
        random_line = random.choice(lines)
        print(random_line.strip())

if __name__ == "__main__":
    get_random_quote()
```