public class Vanedannende extends Legemiddel{

    final int styrke;  // Styrken paa legemidlet

    public Vanedannende(String navn, int pris, double virkestoff, int styrke) {
        super(navn, pris, virkestoff);
        this.styrke = styrke;
    }

    @Override
    public String toString()
    {  // Override for aa presentere informasjon om det vanedannende legemidler
        return  "\nLEGEMIDDEL:" +
                "\nNavn: " + navn +
                "\nType: " + "Vanedannede" +
                "\nMedID: " + id +
                "\nPris: " + pris + ",-" +
                "\nVirkestoff: " + virkestoff + " mg" +
                "\nStyrke: " + styrke;
    }
}
