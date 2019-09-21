package CreatClasses;

public class ParmDemo {
    public static void main(String[] args) {
        ChkNum e = new ChkNum();

        if (e.isEven(10)) System.out.println("10 - число четное");
        if (e.isEven(9)) System.out.println("9 - число четное");
        if (e.isEven(8)) System.out.println("8 - число четное");

        int i, j;
        for(i = 2; i<=20; i++){
            System.out.print("Делители " + i + ": ");
            for(j = 2; j<i; j++){
                if (e.Factor(i,j)) System.out.print(j + " ");

            }
            System.out.println();
        }

    }
}
