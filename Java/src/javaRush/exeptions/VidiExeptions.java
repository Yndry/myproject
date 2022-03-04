package javaRush.exeptions;

import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.IllegalFormatConversionException;

public class VidiExeptions {
    public static void main(String[] args) throws IOException{
        try {


            print(2);
        }
        catch (RuntimeException e) {
            System.out.println(e.getStackTrace());
        }
    }
    public static void print(int i) throws RuntimeException, IOException{
        if (i==0) throw new RuntimeException("Pomogite");
        if(i==1) throw new IOException("kjndk");
    }
}
