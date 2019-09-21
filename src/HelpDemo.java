import java.sql.SQLOutput;

public class HelpDemo
{
    public static void main(String[] args)
            throws java.io.IOException{
        System.out.println("Справка:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" Выберите:");

        char choice ;
        choice =  (char) System.in.read();
        System.out.println("choice = " + choice);
        switch (choice){
            case '1':
                System.out.println("Инcтpyкция if:\n") ;
                System.out .println ( "if (ycлoвиe) инструкция; " ) ;
                System.out.println("else инструкция;");
                break;
            case '2':
                System.out.println("Инcтpyкция switch:\n") ;
                System.out.println("switch(выражение) (");
                System.out.println("case константа : ");
                System.out.println(" последовательность инструкций");
                System.out.println(" break;");
                System.out.println(" // .. .") ;
                System.out.println("}") ;
                break;
            default:
                System.out.println("Запрос не найден");
        }
    }
}
