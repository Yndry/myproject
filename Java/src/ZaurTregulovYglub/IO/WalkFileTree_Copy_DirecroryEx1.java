package ZaurTregulovYglub.IO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class WalkFileTree_Copy_DirecroryEx1 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\d1");
        Path path2 = Paths.get("D:\\P1\\P2\\newDir");
        Files.walkFileTree(path, new MyFileVisitorCopyDirectory(path, path2));
    }
}

/**
 * Имплементируем FileVisitor
 */
class MyFileVisitorCopyDirectory extends SimpleFileVisitor<Path> {
    Path sourse; //КОткуда копируем файл
    Path distination; // Куда копируем файд

    public MyFileVisitorCopyDirectory(Path sourse, Path distination) {
        this.sourse = sourse;
        this.distination = distination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Входим в дирректорию :  " + dir);
        /**
         * Найдем папку куда мы должны копировать
         */
        Path newDestination = distination.resolve(sourse.relativize(dir));
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Fale name is : " + file.getFileName());
        Path newDestination = distination.resolve(sourse.relativize(file));
        Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }
}
