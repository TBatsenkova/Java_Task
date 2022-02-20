public class Main {


        Faerie creatures[] = new Faerie[5];
        creatures[0] = new Fay("One", 12);
        creatures[1] = new Fay("Two", 18);
        creatures[2] = new Fay("Three", 16);
        creatures[3] = new Elf("One", 15);
        creatures[4] = new Elf("Two", 22);

        for (Faerie creature : creatures) {
            creature.dance();
            creature.hug();
            System.out.println("");
        }
    }
}
