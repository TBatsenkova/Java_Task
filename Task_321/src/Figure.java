public class Figure <T, E>{
    //Программа выводит сообщения о названии класса фигуры,
    // количестве фигур и общей площади этих фигур.

    private T figure;
    private E quantity;

    public Figure(T figure, E quantity) {
        this.figure = figure;
        this.quantity = quantity;
    }

    public T getFigure() {
        return figure;
    }

    public void setFigure(T figure) {
        this.figure = figure;
    }

    public E getQuantity() {
        return quantity;
    }

    public void setQuantity(E quantity) {
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        Figure<Circle, Integer> circleFigure = new Figure<>(new Circle(8), 5);
        Figure<Rectangle, Integer> rectangleFigure = new Figure<>(new Rectangle(5, 4), 12);
        System.out.println(circleFigure.figure.getClass().getName() + ", " + circleFigure.quantity + " шт");
        System.out.println("Общая площадь " + circleFigure.figure.getSquare() * circleFigure.quantity);
        System.out.println(rectangleFigure.figure.getClass().getName() + ", " + rectangleFigure.quantity + " шт");
        System.out.println("Общая площадь " + rectangleFigure.figure.getSquare() * rectangleFigure.quantity);

    }
}
