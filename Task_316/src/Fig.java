public class Fig <T> {
    private T figure;

    public Fig(T figure) {
        this.figure = figure;
    }

    public T getFigure() {
        return figure;
    }

    public void setFigure(T figure) {
        this.figure = figure;
    }

    @Override
    public String toString() {
        return "Fig{" +
                "figure=" + figure +
                '}';
    }

    public static void main(String[] args) {
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(45,85);

        System.out.println("Площадь: " + circle.getSquare());
        System.out.println("Тип: " + circle.getClass().getName());
        System.out.println("Площадь: " + rectangle.getSquare());
        System.out.println("Тип: " + rectangle.getClass().getName());

        Fig<Circle> circleFig = new Fig<>(circle);
        Fig<Rectangle> rectangleFig = new Fig<>(rectangle);

        System.out.println("Площадь: " + circleFig.getClass().getName() + ": " + circleFig.figure.getSquare());
        System.out.println("Тип: " + circleFig.getClass().getName());
        System.out.println("Площадь: " + rectangleFig.getClass().getName() + ": " + rectangleFig.figure.getSquare());
        System.out.println("Тип: " +rectangleFig.getClass().getName());



    }


}
