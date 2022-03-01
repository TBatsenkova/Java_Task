public class Main {
    public static void main(String[] args) {
        String str = "The car were stopped.";

        try {
            useCar(5);
        } catch (PEx e) {
            System.out.println(e);
            System.out.println(str);
        }
    }
        public static void useCar(int i) throws PEx {
            if (i > 4) {
                throw  new PEx();
            }
        }

}
