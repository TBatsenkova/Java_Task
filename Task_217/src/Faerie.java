abstract class Faerie implements Magic {
    int strength;
    int health;
    private String name;

    public String getName() {
        return name;
    }

    public Faerie(int strength, int health, String name) {
        this.strength = strength;
        this.health = health;
        this.name = name;
    }
}
