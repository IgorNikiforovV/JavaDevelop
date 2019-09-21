package CreatClasses;

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportcar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

        int range, range2;

         //присваивание значений полям нового класса  minivan
        //minivan.passengers = 7;
        //minivan.feulcap = 16;
        //minivan.mpg = 21;
        gallons = minivan.fuelneeded(dist);

        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " на расстояние " + minivan.range() + " миль");
        System.out.println("Для преодаления " + dist + " мини-фургону потребуется " + gallons + " галлонов топлива ");
        //minivan.range();

        //присваивание значений полям нового класса  minivan
        //sportcar.passengers = 2;
        //sportcar.feulcap = 14;
        //sportcar.mpg = 12;

        //рассчет дальности поездки
        range = minivan.feulcap * minivan.mpg;
        range2 = sportcar.feulcap * sportcar.mpg;
        gallons = sportcar.fuelneeded(dist);

        System.out.println("Спортивный автомобиль может перевезти " + sportcar.passengers + " на расстояние " + sportcar.range() + " миль");
        System.out.println("Для преодаления " + dist + " спортивному автомобилю потребуется " + gallons + " галлонов топлива ");
        //sportcar.range();
    }
}
