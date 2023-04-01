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