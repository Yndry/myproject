package zaurTregulov.collections.zadachaSteckQue;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
       NewQueu qurw = new NewQueu(10);
       qurw.insert(5);
       qurw.insert(10);
       qurw.insert(11);

        //System.out.println(qurw.poll());
      // System.out.println(qurw);

//        while (!qurw.isAmpty()) {
//           long n = qurw.poll();
//            System.out.print(n + " ");
//        }
        qurw.poll();
        qurw.poll();
        qurw.insert(18);
        qurw.poll();
        System.out.println(qurw.peek());


    }
}



class NewQueu {
    private int maxElement;
    private int front;
    private int rear;
    private long[] array;
    private int nItems;

    public NewQueu(int maxElement) {
        this.maxElement = maxElement;
        front = 0;
        rear = -1;
        array = new long[maxElement];
        nItems = 0;
    }

    public void insert(long i) {
        if (rear == maxElement-1) rear = -1;
        array[++rear] = i;
        nItems++;
    }

    @Override
    public String toString() {
        return "NewQueu{" +
                "maxElement=" + maxElement +
                ", front=" + front +
                ", rear=" + rear +
                ", array=" + Arrays.toString(array) +
                ", nItems=" + nItems +
                '}';
    }

    public long poll() {
        if(front == maxElement) front = 0;
        long tmp = array[front++];
        nItems--;
        return tmp;
    }

    public boolean isAmpty() {
        return nItems ==0;
    }

    public long peek() {
        long tmp = array[front];
        return tmp;
    }
}
