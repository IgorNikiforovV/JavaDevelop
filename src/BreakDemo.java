public class BreakDemo {
    public static void main(String[] args) {
        int num = 100;
        int i;

        for (i = 0; i < 100; i++){
            System.out.println("i = " + i);
            if (100 < i * i) break;
        }
    }
}
