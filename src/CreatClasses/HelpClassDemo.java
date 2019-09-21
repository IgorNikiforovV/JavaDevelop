package CreatClasses;

public class HelpClassDemo {

    public static void main(String[] args)
            throws java.io.IOException{

        char choice, ignore;
        Help helpsys = new Help();

        for (;;){

            do {
                helpsys.showmenu();
                choice = (char) System.in.read();
                do{
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!helpsys.isvalid(choice));

            if (choice == 'q') break;
            System.out.println("\n");
            helpsys.helpon(choice);
        }
    }
}
