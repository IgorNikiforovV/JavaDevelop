package HomeWork;

public class ManagConstruction {
    public static void main(String[] args)
    throws java.io.IOException
    {
        System.out.println(" _____________ keyboard input ________________");

        char ch;
        int i = 0;


        do {
            System.out.println("for exit input symbol: '.': ");
            ch = (char) System.in.read();
            if (ch == ' ') i++;
        } while (ch != '.');
        System.out.println("during the implementation of the program was input  " + i + " probelov");

        System.out.println("-----------------------");

        if(100<10)
            if(200<100) {
            if (5!=0) System.out.println("if2");
            else System.out.println("else2");
            }
        else System.out.println("error");// к какой инструкции if относится?

        System.out.println(" ------------------------ ");

        for (int j = 1000; j >= 0; j--){
            System.out.println(j);
        }

        System.out.println(" ------------------------ ");
        int m = 1;
        for(i = 0; i < 10; i++)
        {
            while(m < 6) {
               if (m == 4) break; //...
                System.out.println("m => " + m + " i => " + i);
                m++;

            }
            System.out.println("Пocлe while m: " + m + " i => " + i);
            }
            System.out.println("Пocлe for m: " + m);


        for(i = 0; i<10; i++)
        { System.out.print(i + " ");
            if( (i%2) == 0) continue;
            System.out.println();
        }


    }
}
