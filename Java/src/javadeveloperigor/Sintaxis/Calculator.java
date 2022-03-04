/**
 * Сложный код
 */

package javadeveloperigor.Sintaxis;

import java.util.Scanner;

public class Calculator {
    private static int minIncome = 200000; // Минимальный доход
    private static int maxIncome = 900000; // Максимальный доход

    private static int officeRentCharge = 140000; // Оренда оффиса
    private static int telephonyCharge = 12000; // Затраты на телефон
    private static int internetAccessCharge = 7200; // Затраты на интернет

    private static int assistantSalary = 45000; // Зарплата ассистенат
    private static int financeManagerSalary = 90000; // Зарплата финансового менеджера

    private static double mainTaxPercent = 0.24; // Налоговый процент
    private static double managerPercent = 0.15; // Процент менеджера

    private static double minInvestmentsAmount = 100000; // Минимальные инвестиции

    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите сумму доходов компании за месяц " +
                    "(от 200 до 900 тысяч рублей): ");
            int income = (new Scanner(System.in)).nextInt(); // Ввводим полученные инвестийии

            if (!checkIncomeRange(income)) { // -- проверка условия сооотвествует ли введеное значение порогу условия
                continue;
            }

            double managerSalary = income * managerPercent; // считаем з.п манаджера с учетом процента
            double pureIncome = income - managerSalary -
                    calculateFixedCharges(); // // Считаемчистый доход = Доход - зп менеджера - расчет всех арендных платежей.
            double taxAmount = mainTaxPercent * pureIncome; // Расчет суммы налога % умножаем на чистый доход
            double pureIncomeAfterTax = pureIncome - taxAmount; // Чистый доход после уплаты налогов

            boolean canMakeInvestments = pureIncomeAfterTax >= // Можем ли инвестировать
                    minInvestmentsAmount;

            System.out.println("Зарплата менеджера: " + managerSalary);
            System.out.println("Общая сумма налогов: " +
                    (taxAmount > 0 ? taxAmount : 0));
            System.out.println("Компания может инвестировать: " +
                    (canMakeInvestments ? "да = " + pureIncomeAfterTax : "нет = " + pureIncomeAfterTax));
            if (pureIncome < 0) {
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");
            }
        }
    }

    private static boolean checkIncomeRange(int income) {
        if (income < minIncome) {
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if (income > maxIncome) {
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true;
    }

    private static int calculateFixedCharges() {
        return officeRentCharge +
                telephonyCharge +
                internetAccessCharge +
                assistantSalary +
                financeManagerSalary;
    }
}

