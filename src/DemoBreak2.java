public class DemoBreak2 {
    public static void main(String[] args)
    throws java.io.IOException{
        System.out.println("------------------ break -----------------");
        char ch;

        System.out.println("Введите клавишу: ");
        for (;;){
            ch = (char) System.in.read();
            if (ch == 'q') break;
            else System.out.println("Для завершения введите клавишу 'q'");

        }
        System.out.println("Цикл завершен!");
    }
}
