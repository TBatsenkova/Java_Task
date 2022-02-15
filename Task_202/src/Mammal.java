public class Mammal extends Animal {

    public void canFly() {
        System.out.println(getClass().getSimpleName() + " Can't fly");
    }

    @Override
    public void feed() {
        System.out.println("The food is other small animals.");
    }

}
