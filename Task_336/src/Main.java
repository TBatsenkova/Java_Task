import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("KIA");
        Car car2 = new Car("Volvo");
        BMW car3 = new BMW("BMW 5x", 25000);
        BMW car4 = new BMW("BMW 4x", 22000);
        BMW car5 = new BMW("BMW 3x", 15000);

        ArrayList<Car> carArray = new ArrayList<>();
        carArray.add(car1);
        carArray.add(car2);
        carArray.add(car3);
        carArray.add(car4);
        carArray.add(car5);

        ArrayList<BMW> bmwArray = new ArrayList<>();
        bmwArray.add(car3);
        bmwArray.add(car4);
        bmwArray.add(car5);


        Main.outArrayCar(carArray);
        System.out.println(" ");
        Main.outArrayBMW(bmwArray);
        System.out.println(" ");
        Main.outArrayCar(bmwArray);
    }
    static public void outArrayCar(ArrayList<? extends Car> carsArray) {
        for (Car c : carsArray){
            System.out.println(c.getName());
        }
    }
    static public void outArrayBMW(ArrayList<? extends BMW> carsArr) {
        for (BMW c : carsArr) {
            System.out.println(c.getName() + " " + c.getCost() + " рублей");
        }
    }

}
