public class ContDemo {
    public static void main(String[] args) {
        int i, j;
        //вывод четных чисел от 0 до 100
        for (i = 0; i <= 100; i++){
            if (i % 2 != 0) continue;
            System.out.println(i);
        }
        outreloop:
        for (i = 0; i < 10; i++){
            System.out.print("\nВнешний цикл: проход: " + i + ", внутренний цикл: ");
            for (j = 0; j < 10; j++){
                if (j == 5) continue outreloop;
                System.out.print(j);
            }
        }
    }
}
