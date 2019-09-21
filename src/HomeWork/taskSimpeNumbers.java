package HomeWork;

public class taskSimpeNumbers {
    public static void main(String args[]){
        System.out.println(" --------------- Простые числа -------------- ");
        int i, j;
        boolean b = true;
        System.out.print("Простые числа: ");
        for (i=2; i <= 100; i++){
            for (j=2; j<i; j++){
               if(i % j == 0) {
                   b = false;
               }
            }
            if (b)  System.out.print(i + "\t");
            b = true;
        }
    }
}
