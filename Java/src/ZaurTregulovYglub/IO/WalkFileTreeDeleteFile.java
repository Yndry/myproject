package ZaurTregulovYglub.IO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class WalkFileTreeDeleteFile {
    public static void main(String[] args) throws IOException {


        Path path = Paths.get("D:\\P1\\P2\\newDir");
        Files.walkFileTree(path, new MyFileVisitorDelDirectory());
    }
}

class MyFileVisitorDelDirectory extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Fale name is : " + file.getFileName());
        Files.delete(file); //Удаляем все апки из файла
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println(" Мы выходим из директории : " + dir);
        Files.delete(dir); // удаляем уже чистую от файлов папку
        return FileVisitResult.CONTINUE;
    }
}
