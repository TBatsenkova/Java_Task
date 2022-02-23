public class Main {
    public static void main(String[] args) {
        Object array[] = new Object[3];
        array[0] = new Dog("Rex", "Black", 3);
        array[1] = new Cat("Myrzik", "White", 1);
        array[2] = new Mouse("Minni", "Grey", 1);

        for(Object mas : array){
            System.out.println(mas.toString());
        }

        System.out.println(((Dog)array[0]).name);
        System.out.println(((Cat)array[1]).name);
        System.out.println(((Mouse)array[2]).name);
    }
}

