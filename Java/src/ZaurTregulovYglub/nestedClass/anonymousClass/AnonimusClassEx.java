package ZaurTregulovYglub.nestedClass.anonymousClass;

public class AnonimusClassEx {
    public static void main(String[] args) {
        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a-b;
            }
        };
        System.out.println(m.doOperation(2, 5));
    }


}

interface Math {
    int doOperation(int a, int b);
}
