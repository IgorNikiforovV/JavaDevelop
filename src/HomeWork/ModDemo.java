package HomeWork;

public class ModDemo {
    public static void main(String[] args) {
        int iresult, irem;
        double dresult, drem;

        iresult = 10/3;
        irem = 10 % 3;

        dresult = 10.0/3.0;
        drem = 10.0%3.0;

        System.out.println("Результат еления : " + iresult + " остаток от деления " + irem);
        System.out.println("Результат еления : " + dresult + " остаток от деления " + drem);
        System.out.println("/n");
        System.out.println("----- -------- ------ Укороченные операторы --------- ---------- -------");
        int n, d, q;
        n = 10;
        d = 2;

        if (d != 0 && (n % d) == 0){
            System.out.println(d + " является делителем " + n);
        }
        System.out.println("теперь пусть d = 0");
        System.out.println("проверяем оператор &&");
        d = 0; //d == 0;
        if (d != 0 && (n % d) == 0){
            System.out.println(d + " является делителем " + n);
        }
        System.out.println("проверяем оператор &");
        if (d != 0 & (n % d) == 0){
            System.out.println(d + " является делителем " + n);
        }
    }
}
