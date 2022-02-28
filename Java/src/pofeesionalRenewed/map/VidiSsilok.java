package pofeesionalRenewed.map;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class VidiSsilok {
    /**
     * Виды ссылок
     *
     * Сильная ссылка strongreference
     * мягкая ссылка softReference
     * слабая ссылка weakReference
     * фантомная ссылка fantomReference
     *
     */
    public static void main(String[] args) {
        Integer test = 1;
        /**сильная ссылка любой обьект содержащий сильную ссылку не имеет право на
         * GarbageCollector/ Он не имеет право ее убирать
          */
      //Обернем сильную ссылку слабой ссылкой
        SoftReference<Integer> softReference = new SoftReference<>(test);
        /** создали мягкую ссылку на основе обьекта test
         *
         */
        test = null; // обнулили и потеряли ссылку. Теперь garbage collector может очистить эту ссылку
        // но мусор уберется тогда, когда jvm будет нуждаться в памяти


        //weak reference
        WeakReference<Integer> weakReference = new WeakReference<>(test);
        test = null;
        /**
         * Сильную ссылку garbage collector будет сразу очищать. Не дожидаясь пока jvm понадобится память
         * т.к. уже нет другой сильной ссылки указывающей на этот обьект
         */

        //fantom reference
        // Ему нужны 2 параметра - объект и очередь Queue
        // Когда обьект удаляется то он становится доступным в очереди ReferenceQueue/ Позволяет удалять пустые ссылки

        PhantomReference<Integer> phantomReference = new PhantomReference<>(test, new ReferenceQueue<>());
        //слабая ссылка удадлилась
    }

}
