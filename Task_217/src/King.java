public class King extends Faerie  {
    public King(int strength, int health, String name) {
        super(strength, health, name);
    }

    @Override
    public void makeHurt(Faerie faerie) {
            System.out.println("King " + getName() + " attacks " + faerie.getName());
            faerie.health -= strength;
            System.out.println(faerie.getName() + " was hurt, the health is " + faerie.health);
    }

    @Override
    public void makeTreatment() {
            System.out.print("King " + getName() + " is being treated.");
            health += 10;
            System.out.println(" His health is " + health);
    }
}

