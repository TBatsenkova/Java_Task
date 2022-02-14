public class Cat extends Animal {
    public Cat(String name, int weight, int height) {
        super(name, weight, height);
    }

    @Override
    public void sound() {
        System.out.println(name + " May!");
    }
}
