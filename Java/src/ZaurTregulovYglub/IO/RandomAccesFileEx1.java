package ZaurTregulovYglub.IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccesFileEx1 {
    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile =
                     new RandomAccessFile("test10.txt", "rw")) {
            /**
             * read() прочитает 1 байт на позиции на которой стоит наш указатель "pointer"
             * по дефолту pointer стоит в начале файла перед 1-й буквы
             * по мере чтения и записи piinter будет двигаться влево
             *
             */
            int a = randomAccessFile.read();
            /**
             * Используем кастин
             */
            /**
             * можем прочитать сразу строку
             */
            String s = randomAccessFile.readLine();

            System.out.println((char) a);
            /**
             * первая буква уже прочитатна поэтомустрока выведется со втрой буквы т.к. pointer сместился
             */
            System.out.println(s);
            /**
             * Мы хотим прочитать 101 символ. нам нужно перенести pointer на позицию 101 (начинается с "0")
             * метод seek() -искать
             */
            randomAccessFile.seek(101);
            /**
             * Выводим строку начиная со 101 позиции
             */
            String s2 = randomAccessFile.readLine();
            System.out.println("101 = " + s2);
            /**
             * с помощью seek() МЫ МОЖЕМ установить pointer на любую позицию
             * метод getFilePointer() - указывает на каком месте находится указатель
             */
            randomAccessFile.seek(25);
            long positionPointer = randomAccessFile.getFilePointer();
            System.out.println(positionPointer);
            /**
             * переместимся на "0" позицию и запишем привет
             * writeBytes() - пишет тип String
             * есть и другие типы
             */
            randomAccessFile.seek(0);
            randomAccessFile.writeBytes("*Privet*");
            /**
             * Но мы не дабавили слово привет, а записали поверх старых символов
             */
            /**
             * переместимся в конец файла "-1" так как начинается позиция с "0"
             */
            randomAccessFile.seek(randomAccessFile.length() - 1);
            randomAccessFile.writeBytes("\n\t\t\t\t\tAutor - Robert");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
