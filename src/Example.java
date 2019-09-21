public class Example {
    public static void main(String args[]){
        System.out.println("Java  правит Миром!");
        int var1;
        int var2, var3;
        double varDable = 10.0;
        var1 = 1024; //Присвоение переменной var
        System.out.println("Переменная var1 содержит: " + var1);
        var2 = var1 / 2;
        System.out.println("Переменная var2 содержит:" + var2);
        var3 = var1;
        System.out.println("Переменная var3: " + var3);
        var1 = 100;
        System.out.println("var1:=" + var1 + " var3:=" + var3);

        System.out.println("varDable:=" + varDable);
        varDable = 10.12;
        System.out.println("varDable:=" + varDable);

        if (4 > 10 | 5 > 1 & 4 == 0 ) System.out.println("Вошел");

    }
}
