public class ifDemo {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 3;
        if (a > b) System.out.println("a меньше b");

        //next line won't never be  run
        if (a==b) System.out.println("You don't have to see thes text");
        System.out.println();

        c = a - b; //c=-1
        System.out.println("c == -1 ");
        if (c >= 0) System.out.println("c >= 0 ");
        if (c < 0) System.out.println("c < 0 ");

        System.out.println();

        c = b - a; //c ==1
        System.out.println("c == 1");
        if (c >= 1) System.out.println("c >= 0");
        if (c < 0) System.out.println("c < 0");

    }
}
