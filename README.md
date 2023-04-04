# Python Documentation

# Random Quote Generator

This Python script randomly selects a quote from a collection of text files stored in a directory named "quotes". Each text file in the directory contains different quotes, and the script selects one quote at random from a randomly chosen file.

## Libraries Used

- **os**: This is a built-in Python library used for interacting with the operating system. In this script, it is used to list all the files in the "quotes" directory.

- **random**: This is another built-in Python library that implements pseudo-random number generators for various distributions. In this script, it is used to randomly select a file from the "quotes" directory and a line (quote) from the selected file.

## How the Script Works

1. The `os.listdir("quotes")` function is used to get a list of all the files in the "quotes" directory.

2. The `random.choice(files)` function is used to randomly select a file from the list of files.

3. The selected file is opened in read mode, and all the lines (quotes) in the file are read into a list using the `file.readlines()` function.

4. The `random.choice(lines)` function is used to randomly select a line (quote) from the list of lines.

5. The selected quote is printed to the console with any leading or trailing whitespace removed using the `strip()` function.

## Running the Script

To run the script, navigate to the directory containing the script and execute the following command in the terminal:

```bash
python3 script_name.py
```

Replace `script_name.py` with the name of the script file. The script will print a random quote to the console.

---

# C# Documentation

# Random Line from Random Text File

This C# script selects a random line from a random text file in the current directory and prints it to the console.

## Script Explanation

The script first gets all the text files in the current directory. It then selects a random file from this list. From this file, it reads all the lines and selects a random line. This line is then printed to the console.

## Libraries Used

The script uses the following libraries:

- `System`: This is a fundamental library in C# that provides base functionalities such as Console I/O.
- `System.IO`: This library is used for input/output operations. In this script, it is used to get all the files in the current directory and to read all the lines from a file.
- `System.Linq`: This library provides methods for querying and manipulating data. In this script, it is not directly used, but it is generally used for operations such as filtering, ordering, and grouping on collections.

## Code Breakdown

```CSharp
using System;
using System.IO;
using System.Linq;

class Program
{
    static void Main(string[] args)
    {
        string[] files = Directory.GetFiles(Directory.GetCurrentDirectory(), "*.txt");
        Random random = new Random();
        string randomFile = files[random.Next(files.Length)];
        string[] lines = File.ReadAllLines(randomFile);
        string randomLine = lines[random.Next(lines.Length)];
        Console.WriteLine(randomLine);
    }
}
```

- `string[] files = Directory.GetFiles(Directory.GetCurrentDirectory(), "*.txt");` - This line gets all the text files in the current directory.
- `Random random = new Random();` - This line creates a new instance of the Random class.
- `string randomFile = files[random.Next(files.Length)];` - This line selects a random file from the list of files.
- `string[] lines = File.ReadAllLines(randomFile);` - This line reads all the lines from the selected file.
- `string randomLine = lines[random.Next(lines.Length)];` - This line selects a random line from the lines in the file.
- `Console.WriteLine(randomLine);` - This line prints the selected line to the console.

---

# Java Documentation

# Random Quote File Picker

This Java script reads a file containing quotes, stores them in a list, and then randomly selects and prints one of the quotes.

## Script Explanation

The script begins by importing necessary libraries:

- `java.io.File`: This library is used for file handling in Java. In this script, it is used to open the file containing the quotes.
- `java.io.FileNotFoundException`: This library is used to handle the exception that occurs when the file specified in the `File` object constructor does not exist.
- `java.util.ArrayList`: This library is used to create a dynamic array that can grow as needed. In this script, it is used to store the quotes from the file.
- `java.util.List`: This library is used to create a list in Java. In this script, it is used to store the quotes from the file.
- `java.util.Random`: This library is used to generate random numbers. In this script, it is used to randomly select a quote from the list.
- `java.util.Scanner`: This library is used to read input from various sources like input streams and files. In this script, it is used to read the quotes from the file.

The script then creates a `List` to store the quotes and attempts to open the file containing the quotes. If the file does not exist, the script prints an error message and exits. If the file does exist, the script reads each line (each quote) from the file and adds it to the list.

After all the quotes have been added to the list, the script creates a `Random` object and uses it to generate a random index within the range of the list's size. The script then prints the quote at the randomly selected index.

## Usage

To use this script, simply run it in a Java environment. Make sure that the file containing the quotes ("quotes.txt") is in the same directory as the script. The script will print a random quote from the file.

---
