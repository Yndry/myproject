package javadeveloperigor.numbers;

import java.util.Scanner;

/**
 * Вы доставляете гуманитарную помощь в ящиках одинакового размера. У вас есть грузовики и контейнеры.
 * В каждый грузовик помещается максимум 12 контейнеров. В каждый контейнер — не более 27 ящиков.
 * Ящики, контейнеры и грузовики пронумерованы.
 * Напишите программу, которая распределит ящики по контейнерам и грузовикам в зависимости от их количества.
 * Программа должна выводить необходимое для этого число грузовиков и контейнеров.
 * <p>
 * Принцип работы программы
 * Указываем число ящиков — получаем результат в виде строк:
 * Грузовик 1:
 * Контейнер 1:
 * Ящик 1
 * Ящик 2
 * Ящик 3
 * …
 * Контейнер 2
 * Ящик 28
 * Ящик 29
 * …
 * Необходимо:
 * грузовиков — 1 шт.
 * контейнеров — 10 шт.
 * <p>
 * Рекомендации:
 * Для добавления отступа в строке вы можете использовать символ табуляции «\t».
 * Обратите внимание на арифметическую операцию «Остаток от деления»
 * <p>
 * System.out.println(45 % 10); // вывод будет 5.
 */

public class Zadacha2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите сколько ящиков");
        int yashikCount = scaner.nextInt();
        int conteinerCount = 0;
        int gruzovikCount = 0;
        while (yashikCount >= 27) {
            conteinerCount++;
            yashikCount -= 27;
        }
        if (!(yashikCount % 27 == 0)) conteinerCount = conteinerCount + 1;
        System.out.println(conteinerCount);
        int conteinerCountItog = conteinerCount;
        while (conteinerCount > 12) {
            gruzovikCount++;
            conteinerCount -= 12;
        }
        if (!(conteinerCount % 12 == 0)) gruzovikCount = gruzovikCount + 1;
        System.out.println(gruzovikCount);
        int nomberConteiner = 1;
        int aaa = conteinerCountItog;
        int colvoProhodov;
        for (int i = 1; i <= gruzovikCount; i++) { // Проходим по циклу грузовиков
            System.out.println("Грузовик номер - " + i);
            if (conteinerCountItog >= 12) {
                colvoProhodov = 12;
            } else colvoProhodov = conteinerCountItog;

            System.out.println("Kolvo prohodov = " + colvoProhodov + " Контейнеров " + conteinerCountItog);
            for (int j = 1; j <= colvoProhodov; j++) { // Проходим по циклу контейнеров
                System.out.println(" \tНомер контейнера " + nomberConteiner);
                nomberConteiner++;
            }
            conteinerCountItog = conteinerCountItog - 12;
        }
    }
}

