package fromExamples;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
try(RandomAccessFile randomAccessFile = new RandomAccessFile("test10.txt", "rw")) {
    int a = randomAccessFile.read();
    System.out.println((char)a);
    String s = randomAccessFile.readLine();
    System.out.println(s);
    randomAccessFile.seek(101);


    System.out.println(randomAccessFile.getFilePointer());
    randomAccessFile.seek(0);
    String s2 = randomAccessFile.readLine();
    System.out.println(s2);

    randomAccessFile.writeBytes(s + "fffffffffffffff");
    randomAccessFile.seek(0);
    randomAccessFile.seek(randomAccessFile.length()-1);
    randomAccessFile.seek(0);
    randomAccessFile.writeBytes("hahahaha");
    int b = randomAccessFile.read();
    while ((b= randomAccessFile.read())!=-1) {
        System.out.print((char)b);


    }

}
    }
}