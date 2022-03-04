package javadeveloperigor.Exeptions;

public class ExampExeption1 {
    public static void main(String[] args) {
       int a=2;
       int n=2;
        try {
           //Попытка деления на 0
            a= a/(2-n);
            System.out.printf("a=%d%n",a);
           }
        catch (Exception e) {
            System.out.println(e.getMessage());
            }
    }
}
