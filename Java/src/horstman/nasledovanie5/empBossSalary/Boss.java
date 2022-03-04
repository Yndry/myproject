package horstman.nasledovanie5.empBossSalary;



public class Boss extends Employee{
private double bonus;
    public Boss(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus =0;
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
