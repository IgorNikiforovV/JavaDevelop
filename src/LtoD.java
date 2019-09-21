import javax.sound.midi.Soundbank;

public class LtoD {
    public static void main(String args[]){
        long L;
        double D;

        L = 100123285L;
        D = L;

        //D = 123213123.0;
        //L = D;
        System.out.println("L и D: " + L + " " + D);
        //Преобразование типов
        System.out.println("---------------------------- Преобразоване типов --------------------------");
        {
            int i;
            char ch;
            double x, y;
            byte b;

            x = 10.0;
            y = 3.0;

            i = (int) (x / y); //преобразование double в int
            System.out.println("преобразование double в int: " + (x/y) + " на " + i);

            i = 100;
            b = (byte) i;
            System.out.println("Преобразуем i=100 в byte: " + b);

            i = 257;
            b = (byte) i;
            System.out.println("Преобразуем i=257 в byte: " + b);

            b = 88;
            ch = (char) b;

            System.out.println("int to char ch: " + b);

        }
        System.out.println("Таблица истинности для логических операций \n");
        {
            boolean p, q;
            System. out .println ( "P\tQ\tAND\tOR\tXOR\tNOT" ) ;
            p = true; q = true;
            System.out.print(p + "\t" + q + "\t");
            System.out.print((p&q) + "\t" + (p|q) + "\t");
            System.out.println( (p^q) + "\t" + ( !p) ) ;
            p = true; q = false;
            System.out.print(p + "\t" + q +"\t");
            System.out.print((p&q) + "\t" + (p|q) + "\t");
            System.out.println( (p^q) + "\t" + ( !p) ) ;

            p = false; q = true;
            System.out.print(p + "\t" + q +"\t");
            System.out.print((p&q) + "\t" + (p|q) + "\t");
            System.out.println( (p^q) + "\t" + ( !p) ) ;

            p = false; q = false;
            System.out.print(p + "\t" + q +"\t");
            System.out.print((p&q) + "\t" + (p|q) + "\t");
            System.out.println((p^q) + "\t" + (!p));
            System.out.println();

            System. out .println ( "P\tQ\tAND\tOR\tXOR\tNOT" ) ;
            p = true; q = true;

            if (p) System.out.print(1 + "\t");
            else System.out.print(0 + "\t");
            if (q) System.out.print(1 + "\t");
            else System.out.print(0 + "\t");

            if (p&q) System.out.print(1 + "\t");
            else System.out.print(0 + "\t");
            if (p|q) System.out.print(1 + "\t");
            else System.out.print(0 + "\t");

            if (p^q) System.out.print(1 + "\t");
            else System.out.print(0 + "\t");
            if (!p) System.out.println(1 + "\t");
            else System.out.println(0 + "\t");


            p = true; q = false;
            if (p) System.out.print(1 + "\t");
            else System.out.print(0 + "\t");
            if (q) System.out.print(1 + "\t");
            else System.out.print(0 + "\t");

            if (p&q) System.out.print(1 + "\t");
            else System.out.print(0 + "\t");
            if (p|q) System.out.print(1 + "\t");
            else System.out.print(0 + "\t");

            if (p^q) System.out.print(1 + "\t");
            else System.out.print(0 + "\t");
            if (!p) System.out.println(1 + "\t");
            else System.out.println(0 + "\t");

            p = false; q = true;
            if (p) System.out.print(1 + "\t");
            else System.out.print(0 + "\t");
            if (q) System.out.print(1 + "\t");
            else System.out.print(0 + "\t");

            if (p&q) System.out.print(1 + "\t");
            else System.out.print(0 + "\t");
            if (p|q) System.out.print(1 + "\t");
            else System.out.print(0 + "\t");

            if (p^q) System.out.print(1 + "\t");
            else System.out.print(0 + "\t");
            if (!p) System.out.println(1 + "\t");
            else System.out.println(0 + "\t");

            p = false; q = false;
            if (p) System.out.print(1 + "\t");
            else System.out.print(0 + "\t");
            if (q) System.out.print(1 + "\t");
            else System.out.print(0 + "\t");

            if (p&q) System.out.print(1 + "\t");
            else System.out.print(0 + "\t");
            if (p|q) System.out.print(1 + "\t");
            else System.out.print(0 + "\t");

            if (p^q) System.out.print(1 + "\t");
            else System.out.print(0 + "\t");
            if (!p) System.out.println(1 + "\t");
            else System.out.println(0 + "\t");

        }



    }
}
