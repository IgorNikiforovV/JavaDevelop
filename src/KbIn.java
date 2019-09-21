import java.sql.SQLOutput;

public class KbIn {
    public static void main(String[] args) throws java.io.IOException {
        //throws java.io.IOException {
            char ch;
            System.out.println("Нажмите нужную клавишу, а затем клавишу Enter ");
            ch = (char) System.in.read();
            System.out.println("You pressed butten:  "  + ch);
        //}
    }
}

