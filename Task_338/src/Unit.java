import java.util.ArrayList;
//Программа выводит с кем сражаются  воины,
// потом выводит список противников и список воинов.

public class Unit {
    private String name;
    private int str;

    public Unit(String name, int str) {
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

    public void fight(Unit enemy) {
        System.out.println(getName() + " cила " + getStr() +
                " сражается, противник- " + enemy.getName() + " cила " + getStr());
    }


    static public <T extends Unit> void infoList(ArrayList<T> arrayList) {
        for(T  l : arrayList) {
            System.out.print(l.getClass().getName() + " " + l.getName() + ". ");
        }
    }



    public static void main(String[] args) {
        Elf hero1 = new Elf("Эбин", 100);
        Elf hero2 = new Elf("Эввин", 100);

        ArrayList<Elf> elfArrayList = new ArrayList<>();
        elfArrayList.add(hero1);
        elfArrayList.add(hero2);

        Orc enemy1 = new Orc("Зулф", 100);
        Orc enemy2 = new Orc("Зулло", 100);

        ArrayList<Orc> orcArrayList = new ArrayList<>();
        orcArrayList.add(enemy1);
        orcArrayList.add(enemy2);

        hero1.fight(enemy1);
        hero2.fight(enemy2);

        infoList(orcArrayList);
        infoList(elfArrayList);
    }
}

