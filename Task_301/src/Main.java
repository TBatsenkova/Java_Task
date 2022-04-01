import java.util.HashMap;
import java.util.Map;
// пример использования методов HashMap

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 25000);
        Car car2 = new Car("KIA", 8000);

        HashMap<String, Car> garage = new HashMap<>();
        garage.put("Любимая машина ", car1);
        garage.put("Бюджетная машина ", car2);

        System.out.println(garage.entrySet());
        System.out.println(garage.values());
        System.out.println(garage.keySet());

        for(Map.Entry<String, Car> entry : garage.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().getName());
        }

        System.out.println("Любимая машина" + " " + garage.containsKey("KIA"));
        System.out.println("Любимая машина" + " " + garage.containsValue(car1));
        System.out.println(garage.size());
        System.out.println(garage.isEmpty());
    }
}
