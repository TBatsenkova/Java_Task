import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 12500);
        Car car2 = new Car("KIA", 7500);
        ArrayList<Car> garage = new ArrayList<>();
        garage.add(car1);
        garage.add(car2);
        for (Car cars : garage) {
            cars.buyCar();
        }
        System.out.println(garage.get(0).getName());
        Car car3 = new Car("Volvo", 17500);
        garage.add(0, car3);
        System.out.println(garage.get(0).getName());
        garage.remove(car2);
        for (Car cars : garage) {
            cars.buyCar();
        }
        System.out.println(garage.set(1, car2));
        System.out.println(garage.get(1).getName());
        System.out.println(garage.toString());

    }


}
