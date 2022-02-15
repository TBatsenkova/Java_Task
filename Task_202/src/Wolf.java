import org.w3c.dom.ls.LSOutput;

public class Wolf extends Mammal{
    private String name;
    private int weight;
    private int height;

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public Wolf(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void sound() {
        System.out.println(getName() + " Yyyyy!");
    }

    @Override
    public String toString() {
        return "Wolf " + getName() +
                ", weight = " + getWeight() + " kg" +
                ", height = " + getHeight() + "cm ";
    }
}
