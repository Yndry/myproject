package horstman.nasledovanie5.empBossSalary;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate herDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHerDay() {
        return herDay;
    }

    public void setHerDay(LocalDate herDay) {
        this.herDay = herDay;
    }

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        herDay = LocalDate.of(year, month,day);

    }
    public void raiseSalary (double byPersant) {
        double rase = salary * byPersant / 100;
        salary+=rase;
    }
}


