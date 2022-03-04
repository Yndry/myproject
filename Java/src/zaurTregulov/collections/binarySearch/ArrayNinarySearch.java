package zaurTregulov.collections.binarySearch;

import java.util.Arrays;
import java.util.Collections;

public class ArrayNinarySearch {
    public static void main(String[] args) {
        int [] array = {12, 23,-20, 34, 22,5, -7};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int res = Arrays.binarySearch(array, 23);
        System.out.println(res);


    }
}
