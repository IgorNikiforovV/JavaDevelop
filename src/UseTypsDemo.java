import javax.crypto.spec.PSource;

public class UseTypsDemo {
    public static void main(String[] args) {
        long ci;
        long mi;
        int mi_clone;

        mi = 5280 * 12;
        mi_clone = 5280 * 12;
        System.out.println("mi_clone=" + mi_clone + " mi="+ mi);
        ci = mi * mi * mi;
        mi_clone = mi_clone * mi_clone * mi_clone;
        System.out.println("mi_clone=" + mi_clone+ " ci="+ci);

        System.out.println("В одной кубической миле содержится " + ci + " кубических дюймов");
        System.out.println();
        System.out.println("------------------------рассчет гипотенузы-----------------");
        double x, y, z;
        x = 3;
        y = 4;

        z = Math.sqrt(x*x + y*y);
        System.out.println("Длина гипотенузы: " + z);
        System.out.println("------------------------текстовый тип данных-----------------");
        char ch$c;
        ch$c = 'X';
        System.out.println("X=" + ch$c);
        ch$c++;
        System.out.println("X=" + ch$c);
        ch$c = 90;
        System.out.println("X=" + ch$c);
        System.out.println("------------------------логические типы данных-----------------");
        boolean b;
        b = false;
        System.out.println("b="+b);
        b=true;
        System.out.println("b="+b);
        if(b) System.out.println("it construction is used");
        b = false;
        if(b) System.out.println("it construction is not used");
        System.out.println("Результат сравоения логического значения:");
        System.out.println("10 > 9 " + (10 > 9) + " 11 < 7 " + (11 < 7));
        System.out.println("------------------------Строковый тип-----------------");
        char ch_t$c = '\t';
        char ch_n$c = '\n';
        char ch_k$c = '\'';
        System.out.println("ch_t$c: " + ch_t$c);
        System.out.println("ch_t$c: " + ch_n$c);
        System.out.println("ch_t$c: " + ch_k$c);
        System.out.println("------------------------Объем целиндра-----------------");
        double radius=4, height = 5;
        double volume = 3.1416 * radius * radius * height;
        System.out.println("Volume = " + volume);


    }
}
