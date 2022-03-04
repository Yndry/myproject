package ZaurTregulovYglub.Collections.List.bivvarySearch;

class Employ <T> {
    private T value;

    public Employ(T value) {
        this.value = value;
    }
    public void info() {
        System.out.println(this.value);
    }
}

public class BinnarySearchExamp1 {
    public static void main(String[] args) {

Employ<String> emp1 = new Employ<>("fff");
        emp1.info();
        Employ<Integer> emp = new Employ<>(2);
        emp.info();
    }

//    public <T> T trv(T elem) {
//         res = 0;
//        return res;
//    }
}
