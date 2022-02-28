/**
 * В данном класс будет вычисляться вся математика
 * экземпляров класса будет столько сколько у нас потоков
 */
package javadeveloperigor.thread.summElemMassiveThread;

public class SummThread extends Thread{
    /**
     * Разобьем наш массив
     * 1 поток будет записывать в нечетные элементы массива
     * 2=й поток будет записывать в четные элменты массива
     * если 4-ре потока то идем по степеням 2-ки
     * то 1 поток 0 элемент 4 и тд.
     * 2-й поток 1 эменет 5 и тд.
     */
// для начала нам нужно передать 1-й элемент - точка отсчета прыжка
    private int position;

    public SummThread(int position) {
        this.position = position;
    }

    @Override
    public void run() {
        for(int i=position; i<GlobalData.ARRAY_LENGTH; i+=GlobalData.THREAD_COUNT) {
            //i+=GlobalData.THREAD_COUNT - указали шаг по которому будем идти
            //position - номер потока будет.
            GlobalData.result[position] += GlobalData.array[i];
            //position - это номер потока
        }
    }
}
