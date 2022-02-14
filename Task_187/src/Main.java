public class Main {
    public static void main(String args[]) {
        Animal[] animals = new Animal[2];
        animals[0] = new Cat("Myrka", 15, 25);
        animals[1] = new Dog("Sharik", 36, 52);

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].toString());
            animals[i].eat();
            animals[i].sound();
            System.out.println("");
        }


    }
}
