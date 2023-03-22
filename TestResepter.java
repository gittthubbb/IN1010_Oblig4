public class TestResepter {
    private static int teller = 1;
    public static void main(String[] args) {

        // Oppretter 4 forskjellige legemiddel-objekter
        Narkotisk oxycodoneActavis = new Narkotisk("Oxycodone Actavis", 500, 10, 6);
        Vanedannende zolpidem = new Vanedannende("Zolpidem", 250, 3, 8);
        Vanlig paracet = new Vanlig("Paracet", 100, 500);
        Vanlig pPiller = new Vanlig("P-piller", 150, 4);

        // Oppretter ett lege-objekt
        Lege legeFleming = new Lege("Alexander Fleming");

        // Oppretter 4 forskjellige resept-objekter
        MilResept testMil = new MilResept(oxycodoneActavis, legeFleming, 124495);
        PrevensjonsResept testPrev = new PrevensjonsResept(pPiller, legeFleming, 392352, 5);
        HvitResept testHvit = new HvitResept(paracet,legeFleming, 213959, 1);
        BlaaResept testBlaa = new BlaaResept(zolpidem, legeFleming, 749123, 2);


        System.out.println("\nTester resept-ID:");
        intTest(testMil.reseptId, 0);
        intTest(testPrev.reseptId, 1);
        intTest(testHvit.reseptId, 2);
        intTest(testBlaa.reseptId, 3);


        System.out.println("\nTester pris:");
        intTest(testMil.prisAaBetale(testMil.legemiddel), 0);  // Alltid kostnadsfritt
        intTest(testPrev.prisAaBetale(testPrev.legemiddel), 42);  // Avslag på 108kr
        intTest(testHvit.prisAaBetale(testHvit.legemiddel), 100);  //Standard pris
        intTest(testBlaa.prisAaBetale(testBlaa.legemiddel), 63);  // En fjerdedel av prisen - her rundet opp


        System.out.println("\nTester reit:");
        intTest(testMil.hentReit(), 3);  // Vil alltid ha 3 reit
        intTest(testPrev.hentReit(), 5);


        System.out.println("\nTester farge på resept:");
        stringTest(testMil.farge(), "hvit");  // Underklasse av hvit resept
        stringTest(testPrev.farge(), "hvit");  // Underklasse av hvit resept
        stringTest(testHvit.farge(), "hvit");  // Hvit resept
        stringTest(testBlaa.farge(), "blaa");  // Blaa resept


        System.out.println("\nTester utskrift:");
        System.out.println(testMil);
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
}
