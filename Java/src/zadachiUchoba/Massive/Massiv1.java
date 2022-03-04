package zadachiUchoba.Massive;
//*Напишите программу, которая меняет местами элементы одномерного массива из String
// в обратном порядке. Не используйте дополнительный массив для хранения результатов.

public class Massiv1 {
    public static void main(String[] args) {
        String[] array = new String[] {"aa1", "sss2", "ffjj3", "dddss4", "kdflsj5"};
        int n = array.length;
        String temp;
        for(int i = 0; i<n/2; i++) {
            temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
            System.out.print(temp + " ");
        }
        System.out.println();
        for (String d: array) {
            System.out.print(d + " ");

        }

    }
}
