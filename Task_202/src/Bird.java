public abstract class Bird extends Animal{

    public void canFly() {
        System.out.println(getClass().getSimpleName() + " Can fly");
    }

    @Override
    public void feed() {
        System.out.println("The food is bugs.");
    }

}
