public class Circle {
    private String name = "Круг";
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getSquare() {
        double result = radius * radius * Math.PI;
        return result;
    }
}
