//Программа выводит сообщения о названии фигур,
// их цвете, периметре и площади.

public class Main <T extends Figure> {
    private T figure;

    public Main(T figure) {
        this.figure = figure;
    }

    public T getFigure() {
        return figure;
    }

    public void setFigure(T figure) {
        this.figure = figure;
    }

    public String getInfoAboutFigure() {
        String s = "Фигура " +
                figure.getNameFigure()  +
                ", цвет " + figure.getColor() + ", периметр " +
                figure.getP() + ", площадь " + figure.getSquare();
        return s;
    }

    public static void main(String[] args) {
        Main<Circle> circle1 = new Main<>(new Circle("круг", "красный", 5));
        Main<Figure> circle2 = new Main<>(new Figure());
        System.out.println(circle1.getInfoAboutFigure());
        System.out.println(circle2.getInfoAboutFigure());

    }
}
