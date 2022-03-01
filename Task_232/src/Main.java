public class Main {
    public static void main(String[] args) {
        String str = "Total weight must be less 200 kg ";

        Man man1 = new Man("Vasya", 120);
        Man man2 = new Man("Kolya", 75);
        Man man3 = new Man("Oleg", 88);

        try {
            useLift(man1, man2, man3);
        } catch (WEx e) {
            System.out.println(e.getMessage());
            System.out.println(str);
            System.out.println("");
        }

        try {
            useLift(man1, man2);
        } catch (WEx e) {
            System.out.println(e.getMessage());
            System.out.println(str);
            System.out.println("");
        }

        try {
            useLift(man2, man3);
        } catch (WEx e) {
            System.out.println(e.getMessage());
            System.out.println(str);
            System.out.println("");
        }

        try {
            useLift(man1, man3);
        } catch (WEx e) {
            System.out.println(e.getMessage());
            System.out.println(str);
            System.out.println("");
        }
    }

    public static void useLift(Man... mans) throws WEx {
        int sum = 0;
        for (Man man : mans) {
            sum = sum + man.wight;
        }
        if (sum > 200) {
            System.out.println("Total weight: " + sum);
            throw  new WEx();
        }
    }
}
