package HomeWork;

public class BigToSmallSymbol {
    public static void main(String[] args)
    throws java.io.IOException{

        char ignore, ch = 'A';
        int i = 0;
        int count$i = 0;

        //ch = (char) (196);
        //i = (int) ch;

        //System.out.println("a => " + ch );

        /*System.out.println("a => " + (int) ('a') );
        System.out.println("z => " + (int) ('z') );
        System.out.println("A => " + (int) ('A') );
        System.out.println("Z => " + (int) ('Z') );
        System.out.println();
       // i = (int) 'A';
        System.out.println("i => " + (char) (91) );
        System.out.println("i => " + (char) (92) );
        System.out.println("i => " + (char) (93) );
        System.out.println("i => " + (char) (94) );
        System.out.println("i => " + (char) (95) );
        System.out.println("i => " + (char) (96) );
        System.out.println("i => " + (char) (97) );
        System.out.println("i => " + (char) (98) );*/

        do {

            System.out.println("Введите символ для преобразования(для выхода нажмите '.'): ");
            ch = (char) System.in.read();

            if (ch >= 97 & ch <= 122) {
                System.out.print("Переводим бакву '" + ch + "' в '");
                ch = (char) (ch - 32);
                System.out.println(ch+"'");
                count$i++;
            }
            else if (ch >= 65 & ch <= 90)
            {
                System.out.print("Переводим бакву '" + ch + "' в '");
                ch = (char) (ch + 32);
                System.out.println(ch+"'");
                count$i++;
            }
            else if (ch == '.') System.out.println();
            else System.out.println("Символ '" + ch + "' не является ни большой, ни малой буковй!");
            //Крутая конструкция игнора остальных нажатых клавиш
            do {
                ignore = (char) System.in.read();
            } while (ignore!='\n');

        } while (ch!='.');
        System.out.println("Общее кол-во переведенных симвовлов:" + count$i);
    }
}
