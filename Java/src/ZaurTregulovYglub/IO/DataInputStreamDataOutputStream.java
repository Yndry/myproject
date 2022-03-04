package ZaurTregulovYglub.IO;

import java.io.*;

public class DataInputStreamDataOutputStream {
    public static void main(String[] args) {

        try (DataOutputStream dataOutputStream = new DataOutputStream(
                new FileOutputStream("mytest.bin"));
             DataInputStream dataInputStream = new DataInputStream(
                     new FileInputStream("mytest.bin"))) {
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeByte(5);
            dataOutputStream.writeInt(40);
            dataOutputStream.writeLong(100000);

            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readByte());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readLong());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
