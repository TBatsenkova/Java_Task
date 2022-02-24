public class Main {
    public static void main(String[] args){

        Cat catBarsik1 = new Cat("Barsik", 3);
        Cat catBarsik2 = new Cat("Barsik", 3);
        Cat catNoName = catBarsik1;

        System.out.println(catBarsik1.equals(catBarsik2));
        System.out.println(catBarsik1.equals(catNoName));

        String str = "Hello!";
        String massiv[] = {"Hello!"};

        System.out.println(str.equals("Hello!"));
        System.out.println(str.equals(massiv));

    }
}
