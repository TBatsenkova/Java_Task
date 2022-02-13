public class Main {
    public static void main(String[] args) {
        Box newbox = new Box(25,13,25);
        System.out.println(newbox);

        newbox.increase1(newbox.width, newbox.height, newbox.length);
        System.out.println(newbox);

        newbox.increase2(newbox);
        System.out.println(newbox);
    }
}
