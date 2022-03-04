package horstman.Exeptions;
class MyExpetion extends Exception {
    public MyExpetion() {}
    public MyExpetion(String msg) {
        super(msg);
    }
}
public class Exeption_test {
    public static void f() throws MyExpetion {
        System.out.println("Enter MyExeption from f()");
        throw new MyExpetion();
    }
    public static void g() throws MyExpetion {
        System.out.println("Enter MyExeption from g()");
        throw new MyExpetion("New Expetion g");
    }

    public static void main(String[] args) {
        try {
            f();
        }
        catch (MyExpetion e) {
            e.printStackTrace(System.out);
        }
        try {
            g();
        }
        catch (MyExpetion e) {
            e.printStackTrace(System.err);
        }

    }
}


