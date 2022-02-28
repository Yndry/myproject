package javadeveloperigor.strings;


/**
 * Распечатайте коды всех букв английского алфавита и сами буквы.
 * <p>
 * Напишите код в проекте StringExperiments, который считает сумму заработка всех друзей (Васи, Пети и Маши).
 * String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
 * Используйте методы indexOf(), lastIndexOf(), substring() и trim().
 * <p>
 * <p>
 * Напишите программу, которая на входе через консоль принимает фамилию, имя и отчество одной строкой (например, «Иванов Сергей Петрович») и выводит фамилию, имя и отчество отдельно в формате:
 * Фамилия: Иванов
 * Имя: Сергей
 * Отчество: Петрович
 * <p>
 * Сделать задачу на проверку на ошибки ввода
 * <p>
 * Напишите код в проекте StringExperiments, который считает сумму заработка всех друзей (Васи, Пети и Маши).
 * String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
 * Используйте методы indexOf(), lastIndexOf(), substring() и trim().
 * <p>
 * <p>
 * Напишите программу, которая на входе через консоль принимает фамилию, имя и отчество одной строкой (например, «Иванов Сергей Петрович») и выводит фамилию, имя и отчество отдельно в формате:
 * Фамилия: Иванов
 * Имя: Сергей
 * Отчество: Петрович
 * <p>
 * Сделать задачу на проверку на ошибки ввода
 */

/**
 * Напишите код в проекте StringExperiments, который считает сумму заработка всех друзей (Васи, Пети и Маши).
 * String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
 * Используйте методы indexOf(), lastIndexOf(), substring() и trim().
 *
 */

/**
 * Напишите программу, которая на входе через консоль принимает фамилию, имя и отчество одной строкой (например, «Иванов Сергей Петрович») и выводит фамилию, имя и отчество отдельно в формате:
 * Фамилия: Иванов
 * Имя: Сергей
 * Отчество: Петрович
 */

/**
 * Сделать задачу на проверку на ошибки ввода
 */

/**
 * Пользователь вводит строку, в некоторой части которой содержится конфиденциальная информация. Ваша задача изменить строку и скрыть информацию в < >.
 * Напишите метод
 * String searchAndReplaceDiamonds(String text, String placeholder)
 * который будет заменять в переданной строке String text всё содержимое скобок <> (англ. diamonds) и сами скобки на переданную строку в String placeholder.
 *
 * Пример работы
 * String safe = searchAndReplaceDiamonds(«Номер кредитной карты <4008 1234 5678> 8912», «***»);
 * В safe должна содержаться строка «Номер кредитной карты *** 8912».
 */
public class ZadachaStrings1 {
    public static void main(String[] args) {


//        printCodirovka(); // Печать кодов строки
//        podschetAllZP();
        outFamNameSoname();
    }

    public static void printCodirovka() {
        String s = "аАбБвВгГдДеЕжЖзЗиИкКлЛмМнНоОпП";
        for (int i = 0; i < s.length(); i++) {
            System.out.println((int) s.charAt(i));
        }
    }

    public static void podschetAllZP() {
        String s = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String word = " ";
        int startCount = 0;
        String poverka = " ";
        int partIndex = 0;
        int summZaribotok = 0;
        while (true) {
            partIndex = s.indexOf(poverka, partIndex + 1);
            if (partIndex == -1) break;
            word = s.substring(startCount, partIndex).trim();
            summZaribotok += getZarobotok(word);

            startCount = partIndex;
            partIndex = startCount;
        }
        System.out.printf("Зароботок составляет %d - рублей %n", summZaribotok);

    }

    public static int getZarobotok(String s) {
        int result = 0;
        try {
            result = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            result = 0;
        }
        return result;
    }

    public static void outFamNameSoname() {
        String name = "   Петров Сергей Федорович   ";
        String nameEnter = name.trim();
        int count = 0;
        char proverka = ' ';
        int partIndex = 0;
        int startIndex = 0;
        StringBuilder fio = new StringBuilder();
        partIndex = nameEnter.indexOf(proverka);

        System.out.printf("Фамилия: %s%n", nameEnter.substring(startIndex, partIndex));
        startIndex = partIndex + 1; // прибавляем 1 чтоб не учитывать пробел
        partIndex = nameEnter.indexOf(proverka, startIndex);

        System.out.printf("Имя: %s%n", nameEnter.substring(startIndex, partIndex + 1));
        startIndex = nameEnter.lastIndexOf(proverka);
        partIndex = nameEnter.length();
        System.out.printf("Отчество: %s%n", nameEnter.substring(startIndex + 1, partIndex));
    }
}
