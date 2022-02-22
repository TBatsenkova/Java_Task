public class Main {
    public static void main(String[] args) {
        Integer x = 5;
        String str = "Hello";
        int array[] = {1, 2, 3, 4, 5};
        String array1[] = { "a", "b", "c", "d", "e"};
        Car car1 = new Car("KIA", "red", 15247);
        Car car2 = new Car("Mazda", "black", 555666);
        Object object = new Object();

        System.out.println(x.toString());
        System.out.println(Integer.toString(12));
        System.out.println(str.toString());
        System.out.println(array.toString());
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(object.toString());
    }
}
