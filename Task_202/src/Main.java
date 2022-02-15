public class Main {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Crow("Karkusha", 3, 30);
        animal[1] = new Wolf("Black", 50, 55);
        animal[2] = new Wolf("Bond", 47, 50);

        for (Animal animals : animal ) {
            System.out.println(animals.toString());
            animals.sound();
            animals.canFly();
            animals.feed();
            System.out.println("");
        }
    }
}
