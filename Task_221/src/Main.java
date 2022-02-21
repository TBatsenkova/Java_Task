import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        int array[] = {1, 2, 3, 4, 5};
        Car car1 = new Car("KIA", "red", 15247);
        Car car2 = new Car("Mazda", "black", 555666);
        Object object = new Object();

        System.out.println(str.hashCode());
        System.out.println(array.hashCode());
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(object.hashCode());
    }
}
