package javaRush.enums;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Программа считывает с консоли номер, находит в журнале соответствующего студента и вызывает его отвечать.
 * И даже обрабатывает некорректные числа.
 * * Но есть еще одна проблема: если введено не целое число, метод parseInt бросает NumberFormatException.
 * Оберни часть кода в try-catch так, чтобы программа продолжала работу, даже если было введено не целое число.
 * И если введено не целое число, выведи в консоль сообщение: "Нужно ввести целое число" и выполни continue;
 * для корректной работы цикла.
 */

public class Zadacha1 {

    public static final String PROMPT_STRING = "Введите номер студента, или exit для выхода: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "Отвечает ";
    public static final String NOT_EXIST = "Студента с таким номером не существует";
    public static final String INTEGER_REQUIRED = "Нужно ввести целое число";

    static List<String> studentsJournal = Arrays.asList(
            "Тимур Мясной"
            , "Пенелопа Сиволап"
            , "Орест Злобин"
            , "Ирида Продувалова"
            , "Гектор Гадюкин"
            , "Электра Чемоданова"
            , "Гвидон Недумов"
            , "Роксана Борисенко"
            , "Юлиан Мумбриков"
            , "Зигфрид Горемыкин");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if(input.toLowerCase().equals("exit")) {
                break;
            }
            int studentId;
            try {
                studentId = Integer.parseInt(input);
            }
            catch (NumberFormatException e) {
                System.out.println("Нужно ввести целое число");
                continue;
            }
            try {
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            }
            catch (Exception e) {
                System.out.println(NOT_EXIST);
            }
        }
    }


}
