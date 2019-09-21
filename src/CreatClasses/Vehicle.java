package CreatClasses;

public class Vehicle {
    int passengers; //количество пассажиров
    int feulcap; //емкость топливного бака
    int mpg; //потребление топлива в милях на галлон

    Vehicle(int p, int f, int m){
        passengers = p;
        feulcap = f;
        mpg = m;
    }

    void range_old(){
        System.out.println("Distance : " + (feulcap * mpg) + " миль.");

    }
    int range(){
        return feulcap * mpg;
    }
    double fuelneeded(int miles){
        return miles / mpg;
    }
}
