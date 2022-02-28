package ZaurTregulovYglub.IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BuffersAndChannelsEx1 {
    public static void main(String[] args) throws IOException {
        /**
         * Для того чтобы читать и записыватьв channel воспользуемся
         * RandomAccessFile
         */
        try (RandomAccessFile file = new RandomAccessFile("test10.txt", "rw");
/**
 * Из нашего обьекта file получаем chanell для связи с нашим файлом
 */
             FileChannel channel = file.getChannel();) //channel тоже ресурс)
        {
            /**
             * Чтение из файла
             * Создадим buffer
             */
            ByteBuffer buffer = ByteBuffer.allocate(25);
            /**
             * Будем записывать в буфер а потом из буфера в StringBilder
             */
            StringBuilder stix = new StringBuilder();
            /**
             * читаем информацию из channel и записываем в buffer
             * read(buffer) - возвращает кол-во прочитанных байт
             */
            int byteRead = channel.read(buffer);
            /**
             * весь стих не поместится в буфер размером 25
             * поместимм в цикл и будем читать до тех пор пока есть что читать
             */
            while (byteRead > 0) {
                System.out.println("Read " + byteRead);

                buffer.flip();
                /**
                 * читаем информацию из буфера по 1му байту за раз
                 * испльзуем кастинг
                 */
                while (buffer.hasRemaining()) //пока есть что читать из буфера
                {
                    stix.append((char) buffer.get());
                } //читаем из буфера


                buffer.clear(); //после полного прочтения буфера готовим его для записи
                byteRead = channel.read(buffer);

            }
            System.out.println(stix);

            /**Запись в файл 2 варианта
             *
             */
            /**
            Вариант1
             */
            String text = "\n There are only toways";
            /**
             * Создадим новый Buffer а chanel оставим прежним. Ведь мы работаем с тем де файлом
             */
            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length); //выясним сразу длинну строки
            //занесем строку в буфер
            buffer2.put(text.getBytes());
            //чтобы читать из буфера вызовем flip
            buffer2.flip();
            channel.write(buffer2);

/**
 * Вариант 2 короче
 * в метод wrap передаем массив байтов
 */
ByteBuffer buffer3 = ByteBuffer.wrap(text.getBytes());
channel.write(buffer3);

        }
    }
}



