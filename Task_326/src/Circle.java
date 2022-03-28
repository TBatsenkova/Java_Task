public class Circle extends Figure {
    private int radius;

    public Circle(String nameFigure, String color, int radius) {
        this.nameFigure = nameFigure;
        this.color = color;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        double square = getRadius() * getRadius() * Math.PI;
        return square;
    }

    @Override
    public double getP() {
        double p = 2 * getRadius() * Math.PI;
        return p;
    }
}
