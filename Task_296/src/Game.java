import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {
        Elf elf1 = new Elf("Мона", 40);
        Elf elf2 = new Elf("Лиза", 80);

        ArrayList<Elf> battle = new ArrayList<>();
        battle.add(elf1);
        battle.add(elf2);
        for (Elf e : battle) {
            e.fight();
        }
        Elf elf3 = new Elf("Воор", 75);
        battle.add(elf3);
        for (Elf e : battle) {
            e.fight();
        }
    }
}
