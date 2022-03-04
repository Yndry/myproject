package ZaurTregulovYglub.IO;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("test10.txt");
        /**
         * Если указать неверный путь Exeption выброшен не будет
         */
        File folder = new File("D:\\P1\\P2");
        System.out.println("file.getAbsoluteFile() - " + file.getAbsoluteFile());
        System.out.println("--------------");
        /**
         * является ли путь абсолютным
         */
        System.out.println(folder.isAbsolute());
        System.out.println("--------------");
        /**
         * является ли файл - как обьект класса fileдиректорией
         */
        System.out.println(folder.isDirectory());
        System.out.println("--------------");
        /**
         * Проверяем существует файл всмысле обьект Class File или нет
         */
        System.out.println(folder.exists());
        System.out.println(file.exists());
        System.out.println("--------------");
        /**
         * Создадим дирректорию
         */
        File folder2 = new File("D:\\P1\\P2\\P3");
        folder2.mkdir();
        /**
         * Создадим файл
         */
        File file2 = new File("TestNew");
        file2.createNewFile();
        /**
         * Узнаем размер файла и папки в bate
         */
        System.out.println("--------------");
        System.out.println(file.length());
        System.out.println(folder.length());
        /**
         * Удаление файлов и папок
         */
        file2.delete();
        folder2.delete(); //удалиться папка если в ней нет файлов. Если файлы в папке есть этот метод файлы не удалит
/**
 * проверим содержимое папки
 */
        File[] files = folder.listFiles(); //- возвращает массив <File>
        System.out.println(Arrays.toString(files));
        /**
         * Проверим скрыта ли наш file
         */
        System.out.println(folder.isHidden());
        System.out.println(file.isHidden());
        /**
         * есть ли доступ на чтение файла
         * есть ли доступ на запись файла
         * есть ли доступ на выполнение файла
         */
        System.out.println(folder.canRead());
        System.out.println(file.canWrite());
        System.out.println(folder.canExecute());
    }
}
