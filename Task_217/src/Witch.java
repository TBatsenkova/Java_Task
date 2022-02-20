public class Witch extends Faerie {

    public Witch(int strength, int health, String name) {
        super(strength, health, name);
    }

    @Override
    public void makeHurt(Faerie king) {
        System.out.println("Witch " + getName() + " attacks " + king.getName());
        king.health -= strength;
        health -= 20;
        System.out.println(king.getName() + " was hurt, his health is " + king.health);
    }


    @Override
    public void makeTreatment() {
        System.out.print("Witch " + getName() + " is being treated.");
        health += 10;
        System.out.println(" Her health is " + health);
    }
}

