package ZaurTregulovYglub.IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class BufferChannelWriteFile {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt", "r");
             FileChannel channel = file.getChannel();) {
            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip();
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            buffer.rewind(); //поставил position на "0"
            System.out.println((char) buffer.get());
            System.out.println("------------ ");
            buffer.compact();
            channel.read(buffer);

            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }
            buffer.clear(); //перкинем position а "0"
            channel.read(buffer); //записали символы в buffer
            buffer.flip();
            System.out.println((char) buffer.get()); //выводим 1 символ
            buffer.mark();
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            buffer.reset();
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
