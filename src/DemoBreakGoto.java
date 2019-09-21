public class DemoBreakGoto {
    public static void main(String[] args) {
        System.out.println("------------- show example with GoTo --------------");
        int i;

        for (i = 0; i < 4; i++) {


            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni equal " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;
                    }
                    System.out.println(" after block three");
                }
                System.out.println(" after block two");
            }
            System.out.println(" after block one");
        }

        System.out.println("\nother program - bypass all nested loops");
        int j, k;

        done:
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                for (k = 0; k < 10; k++) {
                    System.out.println(k + " ");
                    if (k == 5) break done; //переход по метке done
                }
                System.out.println("Пocлe цикла по k");
            }
            System.out.println("Пocлe цикла по j");
        }
        System.out.println("Пocлe цикла по i");


        }
}
