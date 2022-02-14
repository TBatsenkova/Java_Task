public class Animal {
    protected String name;
    protected int weight;
    protected int height;

    public Animal(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sound() {
        System.out.println(name + " Sound!");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + name +
                ", weight = " + weight +
                ", height = " + height;
    }
}
