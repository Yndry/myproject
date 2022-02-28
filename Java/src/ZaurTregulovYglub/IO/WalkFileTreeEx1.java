package ZaurTregulovYglub.IO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class WalkFileTreeEx1 {
    /**
     * Выведем информацию на экран о всех файлах и директориях
     */
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\P1");
        Path path2 = Paths.get("D:\\P1\\P2\\Z");


    }
}

class MyFileVisitor implements FileVisitor<Path> {


    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Входим в дирректорию :  " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Fale name is : " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("error while visiting file: " + file.getFileName());
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println(" Мы выходим из директории : " + dir);
        return FileVisitResult.CONTINUE;
    }
}