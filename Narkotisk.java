public class Narkotisk extends Legemiddel {

    public final int styrke;  // Styrken paa legemidlet

    public Narkotisk(String navn, int pris, double virkestoff, int styrke) {
        super(navn, pris, virkestoff);
        this.styrke = styrke;
    }

    @Override
    public String toString() {
        // Override for aa presentere informasjon om det narkotiske legemidlet
        return  "\nLEGEMIDDEL:" +
                "\nNavn: " + navn +
                "\nType: " + "Narkotisk" +
                "\nMedID: " + id +
                "\nPris: " + pris + ",-" +
                "\nVirkestoff: " + virkestoff + " mg" +
                "\nStyrke: " + styrke;
    }
}
