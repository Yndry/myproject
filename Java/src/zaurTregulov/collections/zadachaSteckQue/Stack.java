package zaurTregulov.collections.zadachaSteckQue;

public class Stack {
    public static void main(String[] args) {


                String string = "12.84";
                //напишите тут ваш код
                double w = parseDouble(string);
                System.out.println(Math.round(w));
            }
            public static double parseDouble(String string) {
                double s = Double.parseDouble(string);
                return s;
            }
        }
