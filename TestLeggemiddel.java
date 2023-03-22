public class TestLeggemiddel {

    private static int teller = 1;

    public static void main(String[] args) {

        // Oppretter 3 forskjellige legemiddel-objekter
        Narkotisk oxycodoneActavis = new Narkotisk("Oxycodone Actavis", 500, 10, 6);
        Vanedannende zolpidem = new Vanedannende("Zolpidem", 250, 3, 8);
        Vanlig paracet = new Vanlig("Paracet", 100, 500);


        System.out.println("\nTester legemiddel-ID:");
        intTest(oxycodoneActavis.id, 0);
        intTest(zolpidem.id, 1);
        intTest(paracet.id, 2);


        System.out.println("\nTester pris:");
        intTest(oxycodoneActavis.hentPrisen(), 500);
        intTest(zolpidem.hentPrisen(), 250);
        intTest(paracet.hentPrisen(), 100);

        oxycodoneActavis.settNyPris(600);  // Sjekker med en forandring i pris
        intTest(oxycodoneActavis.hentPrisen(), 600);


        System.out.println("\nAndre tester:");
        intTest(oxycodoneActavis.styrke, 6);
        doubleTest(zolpidem.virkestoff, 3);
        stringTest(paracet.navn, "Paracet");


        System.out.println("\nTester utskrift:");
        System.out.println(oxycodoneActavis);
    }


    public static void intTest(int faktiskResultat, int forventetResultat) {
        if (faktiskResultat == forventetResultat) {
            System.out.println("Riktig #" + teller);
        } else {
            System.out.println("Feil #" + teller);
        }
        teller ++;
    }


    public static void stringTest(String faktiskResultat, String forventetResultat) {
        if (faktiskResultat.equals(forventetResultat)) {
            System.out.println("Riktig #" + teller);
        } else {
            System.out.println("Feil #" + teller);
        }
        teller ++;
    }


    public static void doubleTest(double faktiskResultat, double forventetResultat) {
        if (faktiskResultat == forventetResultat) {
            System.out.println("Riktig #" + teller);
        } else {
            System.out.println("Feil #" + teller);
        }
        teller ++;
    }
}