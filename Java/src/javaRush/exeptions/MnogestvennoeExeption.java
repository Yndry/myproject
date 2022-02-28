package javaRush.exeptions;

public class MnogestvennoeExeption {

    /**
     * Множественная обработка исключений
     * Блоков catch может быть сколько угодно. Однако в одном блоке catch нельзя указать исключения,
     * которые наследуются друг от друга. Т.е. нельзя написать catch (Exception | RuntimeException e),
     * т.к. класс RuntimeException унаследован от Exception.
     */

//    try
//    {
//        код, где может возникнуть ошибка
//    }
//catch(ТипИсключения1 | ТипИсключения2 | ТипИсключения3 имя)
//    {
//        код обработки исключений
//    }
}

//try {
//        System.out.println("Программа работает от забора");
//        Thread.sleep(1000);
//        System.out.println("до обеда");
//        } catch (NullPointerException e) {
//        System.out.println("Произошло исключение на букву N");
//        } catch (NumberFormatException e) {
//        System.out.println("Произошло исключение на букву N");
//        } catch (IllegalArgumentException e) {
//        System.out.println("Произошло исключение на букву I");
//        } catch (IllegalStateException e) {
//        System.out.println("Произошло исключение на букву I");
//        } catch (ClassCastException e) {
//        System.out.println("Произошло исключение на букву C");
//        } catch (InterruptedException e) {
//        System.out.println("Произошло исключение на букву I");
//        }
