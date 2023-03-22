public class Vanlig extends Legemiddel{

    public Vanlig(String navn, int pris, double virkestoff) {
        super(navn, pris, virkestoff);
    }

    @Override
    public String toString()
    {  // Override for aa presentere informasjon om det vanlige legemidler
        return  "\nLEGEMIDDEL:" +
                "\nNavn: " + navn +
                "\nType: " + "Vanlig" +
                "\nMedID: " + id +
                "\nPris: " + pris + ",-" +
                "\nVirkestoff: " + virkestoff + " mg";
    }
}
