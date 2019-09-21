/*
программа перевода галлонов в литры
 */
public class GalToLitr {
    public static void main(String[] args) {
        double gallons; //жидкость в галлонах
        double liters; //жидксоть в литрах
        gallons = 10;
        liters = gallons * 3.7854;
        System.out.println("в " + gallons + " галонах содержится " + liters +  " литра");

        System.out.println("--------------------------------------------------");
        int count$i;
        for (count$i = 1; count$i<=30; count$i++){
            System.out.println(count$i + " галлонам соответствует " + count$i * 3.7854 + " литров ");
            if (count$i == 10) System.out.println();
        }

        System.out.println("---------------------------------------------------------------");
        // перевод футы в дюймф
        double oneMetrToDume = 39.3701;
        double oneFutTorDume = 12;
        int Foot12$i = 12;

        for (count$i = 1; count$i <= oneFutTorDume*12; count$i++){
            System.out.println("В " + count$i + " части дюйма содержится " + count$i/oneMetrToDume + " части кметра");
            if (count$i == Foot12$i){
                Foot12$i = Foot12$i + 12;
                System.out.println();
            }
        }
    }

}
