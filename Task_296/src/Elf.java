public class Elf {
    private String name;
    private int str;

    public Elf(String name, int str) {
        this.name = name;
        this.str = str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public void fight() {
        System.out.println("Эльф " + getName() + " сила " + getStr() + " сражается с троллями.");
        str -= 20;
        if (str <= 0) {
            System.out.println("Эльф " + getName() + " погиб.");
        }

    }
}
