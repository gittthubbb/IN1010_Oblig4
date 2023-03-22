public class Main {
    public static void main(String[] args) {

        // Oppretter 4 forskjellige legemiddel-objekter
        Narkotisk oxycodoneActavis;
        oxycodoneActavis = new Narkotisk("Oxycodone Actavis", 500, 10, 6);
        Vanedannende zolpidem = new Vanedannende("Zolpidem", 250, 3, 8);
        Vanlig paracet = new Vanlig("Paracet", 100, 500);
        Vanlig pPiller = new Vanlig("P-piller", 150, 4);

        // Oppretter 2 forskjellige lege-objekter
        Lege legeFleming = new Lege("Alexander Fleming");
        Spesialist spesialistBlackwell = new Spesialist("Elizabeth Blackwell", "G14r43K617Lp7");

        // Oppretter 4 forskjellige resept-objekter
        MilResept testMil = new MilResept(oxycodoneActavis, spesialistBlackwell, 124495);
        PrevensjonsResept testPrev = new PrevensjonsResept(pPiller, legeFleming, 392352, 5);
        HvitResept testHvit = new HvitResept(paracet,legeFleming, 213959, 1);
        BlaaResept testBlaa = new BlaaResept(zolpidem, spesialistBlackwell, 749123, 2);


        System.out.println("\n1. UTSKRIFT MILRESEPT:");
        System.out.println(testMil);

        System.out.println("\n\n2. UTSKRIFT PREVENSJONSRESEPT:");
        System.out.println(testPrev);

        System.out.println("\n\n3. UTSKRIFT HVIT RESEPT:");
        System.out.println(testHvit);

        System.out.println("\n\n4. UTSKRIFT BLAA RESEPT:");
        System.out.println(testBlaa);
    }
}
