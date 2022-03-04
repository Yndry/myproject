package golovach_coyrses.Lekciya10;

import javax.swing.plaf.synth.SynthRootPaneUI;

public class Ssilka {
    public static void main(String[] args) {
        B x = new B();
    }
}
class A {
    A() {
        System.out.println("Class A");
    }
}
class B extends A{
    B() {
        System.out.println("Class B");
    }
}