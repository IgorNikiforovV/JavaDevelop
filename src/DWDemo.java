public class DWDemo {
    public static void main(String[] args)
    throws java.io.IOException{
        //char ch;
        //do {
        //    System.out.println("Нажмите нужную клавишу, а затем клавишу Enter: ");
        //    ch = (char) System.in.read();
        //} while (ch != 'q');
        System.out.println("___________________ Game _________________");
        char ch, ignore, answer = 'K';

        do {
            System.out.println("Задумана буква в диапазоне A-Z");
            System.out.println("Попытайтесь ее угадать: ");

            ch = (char) System.in.read();
            //отбрасывание всех остальных символов во входном буфере
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (answer == ch){
                System.out.print("********* Поздравляем вы угадали! **********");
            }
            else {
                System.out.print("...Извините, нужная буква находится ");
                if (ch < answer) System.out.println(" ближе к концу алфавита");
                else System.out.println(" ближе к началу алфавита");
                System.out.println("Повторите попытку! \n");
            }

        } while (answer != ch);

    }
}
