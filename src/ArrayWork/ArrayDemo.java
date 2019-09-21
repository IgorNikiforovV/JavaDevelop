package ArrayWork;

public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("Work with array");

        int sample[] = new int[10];
        int i;

        for (i = 0; i < 10;i++){
            sample[i] = i;
        }

        for (i = 0; i < 10;i++){
            System.out.println(i + "-й элемент массива: " +  sample[i]);
        }
        System.out.println("---------------------------------------------");
        System.out.println("перебор массива для поиска min и max значений");
        System.out.println();

        //int nums[] = new int[10];
        int nums[] = {5, 23, 11, 19, -44, 56, 99, -55, 0, 29};
        int min, max;

        nums[0] = 5;
        nums[1] = 23;
        nums[2] = 11;
        nums[3] = 19;
        nums[4] = -44;
        nums[5] = 56;
        nums[6] = 99;
        nums[7] = -55;
        nums[8] = 0;
        nums[9] = 29;

        min = max = nums[1];

        for (i = 0;i < 10; i++){
            if (nums[i] < min) min = nums[i] ;
            if (nums[i] > max) max = nums[i] ;
        }
        System.out.println("минимальное значение массива: " + min);
        System.out.println("максимальное значение массива: " + max);

        System.out.println("---------------------------------------------");
        System.out.println("--- сортировка методом пузырька ---");
        System.out.println();

        int conts = 0;
        int j;

        System.out.print("Значения массива nums before sort: ");
        for (i = 0; i < 10;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println("");

        for(i = 0; i < 10; i++){
            for (j = i + 1; j < 10 ; j++){
                if (nums[i] > nums[j]){
                    conts = nums[i];
                    nums[i] = nums[j];
                    nums[j] = conts;
                }
            }
        }
        System.out.print("Значения массива nums  after sort: ");
        for (i = 0; i < 10;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("Настоящий пузырек");
        nums[0] = 5;
        nums[1] = 23;
        nums[2] = 11;
        nums[3] = 19;
        nums[4] = -44;
        nums[5] = 56;
        nums[6] = 99;
        nums[7] = -55;
        nums[8] = 0;
        nums[9] = 29;

        System.out.print("Значения массива nums before sort: ");
        for (i = 0; i < 10;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        int size = 10;
        for (i = 1; i < size; i++ ){
            for (j = size-1; j >= i ; j --){
                if (nums[j-1] > nums[j]){
                    conts = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = conts;
                }
            }
        }

        System.out.print("Значения массива nums  after sort: ");
        for (i = 0; i < 10;i++){
            System.out.print(nums[i] + " ");
        }

        System.out.println();
        System.out.println("--------------------  многомерные массивы --------------------------");
        System.out.println();
        int TwoSArray[][] = new int [3][4];

        for (i=0; i < 3; i++)
            for (j=0; j<4; j++)
                TwoSArray[i][j] = (j * 4) + i +1;
        System.out.println("output a two-dimensional array: ");
        for (i=0; i < 3; i++) {
            for (j = 0; j < 4; j++)
                System.out.print(TwoSArray[i][j] + " ");
            System.out.println();
        }
    }
}
