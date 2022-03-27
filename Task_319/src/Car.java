import java.util.concurrent.Callable;

public class Car <T> {
    private T car;

    public Car(T car) {
        this.car = car;
    }

    public T getCar() {
        return car;
    }

    public void setCar(T car) {
        this.car = car;
    }

    public static void main(String[] args) {
        Car<KIA> car1 = new Car<>(new KIA(2014));
        System.out.println(car1.car.toString());
        Car<BMW> car2 = new Car<>(new BMW(2022));
        System.out.println(car2.car.toString());
    }
}





