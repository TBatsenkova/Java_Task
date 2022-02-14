public class Dog extends Animal {
    public Dog(String name, int weight, int height) {
        super(name, weight, height);
    }

    @Override
    public void sound() {
        System.out.println(name + " Gav!");
    }
}
