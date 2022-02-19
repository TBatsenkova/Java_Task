public class Elf implements Faerie{
    private String name;
    private int strength;

    public Elf(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void dance() {
        strength = strength + 10;
        System.out.println("Fay " + getName() + " is dancing, " + "magic is " + strength);
    }

    @Override
    public void hug() {
        strength = strength + 10;
        System.out.println("Fay " + getName() + " is hagging, " + "magic is " + strength);
    }
}
