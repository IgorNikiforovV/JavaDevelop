public class SwitchDemo {
    public static void main(String[] args) {
        int i;

        for (i=0; i<=10; i++){
            switch(i){
                case 0:
                    System.out.println("i equal to 0");
                    break;
                case 1:
                    System.out.println("i equal to 1");
                    break;
                case 2:
                    System.out.println("i equal to 2");
                    break;
                case 3:
                    System.out.println("i equal to 3");
                    break;
                case 4:
                    System.out.println("i equal to 4");
                    break;
                 default:
                     System.out.println("i greater or equal to 5");
            }
        }
        System.out.println("\n");
        i = 3;
        switch(i) {
            case 1: System.out.println("i равно 1");
            case 2:System.out.println("i равно 2");
            case 3:
                System.out.println("i равно 1, 2 или 3");
                break;
            case 4:
                System.out.println("i равно 4");
                break;
        }

        }
}
