package ZaurTregulovYglub.IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Map;

public class InterfacePathclassFiles {
    public static void main(String[] args) throws IOException {
        Path filPath = Paths.get("test10.txt");
        Path directoryPath = Paths.get("D:\\P1\\P2\\z\\s");
        System.out.println(filPath.getFileName());
        System.out.println(directoryPath.getParent());
        System.out.println(directoryPath.getRoot());
        System.out.println(directoryPath.isAbsolute());
        System.out.println(filPath.toAbsolutePath());
        System.out.println(filPath.toAbsolutePath().getParent());
        System.out.println(directoryPath.toAbsolutePath().getParent());
//        System.out.println(directoryPath.resolve(filPath ));
        //      System.out.println(directoryPath.relativize(filPath));
//        if(!Files.exists(filPath)) {
//            Files.createFile(filPath);
//        }
//        if(!Files.exists(directoryPath)) {
//            Files.createDirectory(filPath);
//        }
        Map<String, Object> attribute = Files.readAttributes(filPath, "*");
        for (Map.Entry<String, Object> entry : attribute.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        Path file3 = Paths.get("test1.txt");
        Path directory3 = Paths.get("D:\\P1\\P2\\z");
        Path directory34 = Paths.get("D:\\D1");
//Files.copy(file3, directory3.resolve(file3));
        // Files.copy(file3, directory3.resolve("file1010.txt"));
//        Files.copy(file3, directory3.resolve("file1010.txt"), StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(directory34, directory3.resolve("D1")); //копипуемая папка будет называться D1
//        Files.move(Paths.get("test1.txt"), (Paths.get("test22.txt")));
//Files.delete(Paths.get("test22.txt"));
//Files.write(Paths.get("test10"), "fffff\nnddddd\nvvv\n".getBytes()); //переводим в массив байт
        List<String> list = Files.readAllLines(Paths.get("test10")); //readAllLines - возвращает List<String>
        for (String s : list) {
            System.out.println(s);
        }
    }
}
