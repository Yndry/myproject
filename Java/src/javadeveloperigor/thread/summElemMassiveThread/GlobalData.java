/**
 * В этом классе будут все переменные для нашей задачи
 * Здесь будут все перменные, все константы, с которыми мы будем работать.
 *
 */

package javadeveloperigor.thread.summElemMassiveThread;

import java.lang.reflect.Array;

public class GlobalData {
    public final static int ARRAY_LENGTH = 500_000_000;
    //завели переменную для колва элементов массива. так лучше всегда делать.
    public static final int THREAD_COUNT = 2;
    //Завели константу - количество потоков, которые будем использовать.

    public static int[] array;
    // обьявили массив

    public static long[] result;
    // создали массив из long для того чтобы туда помещать массив результатов
    //массив будет буфером, куда будут помещены результаты вычислоения
    //каждого потока. А потом все элементы просто сложим и получим сумму
}
