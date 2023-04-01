```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomQuoteFilePicker {
    public static void main(String[] args) {
        List<String> quotes = new ArrayList<>();
        try {
            File file = new File("quotes.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                quotes.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(0);
        }
        Random random = new Random();
        int index = random.nextInt(quotes.size());
        System.out.println(quotes.get(index));
    }
}
```