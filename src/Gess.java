public class Gess {
    public static void main(String[] args)
    throws java.io.IOException
    {
        char ch, answer = 'K';
        System.out.println("The hidden letter A-Z: ");
        System.out.println("Tray it guess");

        ch = (char) System.in.read();
        if (ch == answer){
            System.out.println("You are right!");
        }
        else {
            System.out.println("I'm so sorry, You aren't guess  ");
            if (ch > answer) System.out.println("near the end of the alphabet");
            else System.out.println("near the beginning of the alphabet");
        }
    }
}
