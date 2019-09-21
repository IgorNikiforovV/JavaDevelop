public class whileDemo {
    public static void main(String[] args) {
        char ch;
        ch = 'a';


        while (ch <= 'z'){
            System.out.println(ch);
            ch++;
        }
        System.out.println();

        System.out.println("Подсчет степеней числа 2: от 2° до 29•");
        int i, e=0, result=1;

        for (i = 0;i < 10; i++){
            result =1;
            e = i;
            while (e > 0){
                 result *= 2;
                 e--;
            }
            System.out.println("2 в степени " + i + " равно " + result);
        }

    }
}
