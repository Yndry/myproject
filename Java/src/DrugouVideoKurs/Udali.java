package DrugouVideoKurs;

import java.util.*;

public class Udali {
    public static void main(String[] args) {
        int[] array = {10, 23, 12, 3, 3};
        recursiya(array, 0);
        // System.out.println(array);

    }

    public static void recursiya(int[] array, int k) {
        if (k < array.length / 2) {
            int tmp = array[k];
            array[k] = array[array.length - k - 1];
            array[array.length - k - 1] = tmp;
            k++;
            recursiya(array, k);
        }
        System.out.print(Arrays.toString(array)) ;

    }
}

