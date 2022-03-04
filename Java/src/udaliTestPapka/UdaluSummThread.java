package udaliTestPapka;

import javadeveloperigor.thread.summElemMassiveThread.GlobalData;

public class UdaluSummThread extends Thread {
    private int position;

    public UdaluSummThread(int position) {
        this.position = position;
    }


    @Override
    public void run() {
        for (int i = position; i < UdaliDataGlobal.ARRAY_LENGTH; i += UdaliDataGlobal.THREAD_COUNT) {
            UdaliDataGlobal.resault[position] += UdaliDataGlobal.array[i];
        }
        System.out.println("Resuult " + UdaliDataGlobal.resault[0]);
    }
}
