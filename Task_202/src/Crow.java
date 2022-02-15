public class Crow extends Bird {
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

    public Crow(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void sound() {
        System.out.println(getName() + " Karrr!");
    }

    @Override
    public String toString() {
        return "Crow " + getName() +
                ", weight = " + getWeight() + " kg" +
                ", height = " + getHeight() + "cm ";
    }
}
