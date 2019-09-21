public class forDemo {
    public static void main(String[] args)
    throws java.io.IOException{
        double sroot, num, rerr;

        for (num = 1.0; num < 100.0; num++){
            sroot = Math.sqrt(num);
            System.out.println("Корень квадратный из " + num + " равен "+sroot);

            // errors round
            rerr = num - (sroot * sroot);
            System.out.println("Ошибка окруления: " + rerr);
            System.out.println();
        }

        int  i, j;

        for (i = 0, j = 10; i < j; i++, j--){
            System.out.println("i = " + i + "; j = " + j);
        }
        System.out.println("Для остановки нажмите 'S' ");

        for (i = 0; (char) System.in.read() != 'S'; i++){
            System.out.println("Проход #" + i);
        }
        System.out.println();
        System.out.println("loop without body");
        i = 0;
        int sum = 0;

        for (i = 1;i <= 5; sum += i++);
        System.out.println(" sum = " + sum);

        System.out.println();
        System.out.println("Объявляем переменную i в самом цикле");
        sum = 0;
        int fact = 1;

        for(int v = 1; v <= 5; v++){
            sum += v;
            fact *=v;
        }
        System.out.println("Сумма = " + sum);
        System.out.println("Факориал = "+ fact);

    }
}
