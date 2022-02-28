package ZaurTregulovYglub.IO;

import java.io.*;

public class BufferedReaderBufferedWriterEx1 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader =
                     new BufferedReader(new FileReader("text1.txt"));
             BufferedWriter writer =
                     new BufferedWriter(new FileWriter("text111.txt"));) {
            int charakter;
            while ((charakter = reader.read()) != -1) {
                writer.write(charakter);
            }
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                /**
                 * Записывем каждую линию в новую строчку
                 */
                writer.write('\n');
            }
        }
    }
}
