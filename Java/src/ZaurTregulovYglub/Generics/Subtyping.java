package ZaurTregulovYglub.Generics;


import java.util.ArrayList;
import java.util.List;

class X{

}
class Y extends X {

}

class Зкшь <T extends Number> {

}


public class Subtyping {
    public static void main(String[] args) {
    X x = new Y(); // так работает
    //List<X> list = new ArrayList<Y>(); //так не работает
    }
}