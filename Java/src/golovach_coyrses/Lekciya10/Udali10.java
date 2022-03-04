package golovach_coyrses.Lekciya10;

import DrugouVideoKurs.Udali;

class Villain {
    private String name;
    protected void set(String nm) {
        name = nm;
    }
    public Villain(String name) {this.name = name;}
 @Override
   public String toString() {
        return "Я обьект Villian и мое имя" + name;
    }
}


public class Udali10 extends Villain{
private int orcNumber;
public Udali10(String name, int orcNumber) {
    super(name);
    this.orcNumber = orcNumber;

}
public void change(String name, int orcNumber) {
    set(name);
    this.orcNumber = orcNumber;
    }
    @Override
    public String toString() {
    return "Orc " + orcNumber + " : " + super.toString();
    }

    public static void main(String[] args) {
        Udali10 orc = new Udali10("Limberg", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
    }
}
