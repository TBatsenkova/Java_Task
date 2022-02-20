public class Main {
    public static void main(String[] args) {

        King kingArtur = new King(30, 150, "Artur");
        Faerie[] faeries = new Faerie[5];
        faeries[0] = new King(20, 100, "Richard");
        faeries[1] = new Witch(15, 50, "Riana");
        faeries[2] = new Witch(15, 50, "Chloya");
        faeries[3] = new Witch(15, 50, "Mona");
        faeries[4] = new Witch(15, 50, "Liza");

        for (Faerie faerie : faeries) {
             faerie.makeHurt(kingArtur);
             faerie.makeTreatment();
             System.out.println("");
            }

        kingArtur.makeTreatment();

    }
}


