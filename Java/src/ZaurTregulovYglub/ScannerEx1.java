package ZaurTregulovYglub;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Выведем слова без дубликатов в отсортированном по алфавиту порядке
 */
public class ScannerEx1 {
    public static void main(String[] args) {

        Scanner scanner = null;
        Set<String> set = new TreeSet<>();
        try {
            scanner = new Scanner(new FileReader(new File("text1.txt")));
            scanner.useDelimiter("\\W");
            while (scanner.hasNext()) {
                String word = scanner.next();
                set.add(word);
            }
            for(String word: set) {
                System.out.println(word);
            }
        } catch (FileNotFoundException e) {

        }
        finally {
            scanner.close();
        }

    }
}
