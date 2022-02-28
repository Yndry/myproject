package golovach_coyrses.Lekciya10;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Lekciya10 {
    public static void main(String[] args) throws Exception {
        byte[] bytes = {70, 71, 72};
        String str = new String(bytes, "UTF-8");
        System.out.println(str);
        char[] chars = str.toCharArray();
        String s = new String(chars);
        System.out.println(s);
        int x=1;
        int y = 00111;
        System.out.println(y);
        String str1 = "\u00FF";
        System.out.println(str1);
        String str2 = new String(new char[] {0x0FFF, 0x0FFF});
        System.out.println("---" + str2);




    }
}
