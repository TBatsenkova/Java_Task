import java.util.ArrayList;
//Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
//Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//Для хранения фруктов внутри коробки можно использовать ArrayList;
//Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
//Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
//Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
//Не забываем про метод добавления фрукта в коробку.

public class Main {
    public static void main(String[] args) {
        Box<Fruit> appleBox = new Box<>(new ArrayList<>());
        appleBox.addFruit(new Apple(10));
        appleBox.addFruit(new Apple(2));
        appleBox.addFruit(new Apple(3));
        System.out.println("Вес коробки с яблоками: " +
                appleBox.getBoxWeight() + " кг");

        Box<Orange> orangeBox = new Box<>(new ArrayList<>());
        orangeBox.addFruit(new Orange(6));
        orangeBox.addFruit(new Orange(2));
        orangeBox.addFruit(new Orange(5));
        System.out.println("Вес коробки с апельсинами: " +
                orangeBox.getBoxWeight() + " кг");

        System.out.println("Коробка с яблоками тяжелее коробки" +
                " с апельсинами?: " + appleBox.isHeavyThen(orangeBox));

        Box<Fruit> appleBox2 = new Box<>(new ArrayList<>());
        appleBox2.addFruit(new Apple(10));
        System.out.println("Вес второй коробки с яблоками: " +
                appleBox2.getBoxWeight() + " кг");

        appleBox.poreBoxInto(appleBox2);
        System.out.println("Вес второй коробки с яблоками: " +
                appleBox2.getBoxWeight() + " кг");
    }

}
