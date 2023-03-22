abstract class Legemiddel {

    public final String navn;  // Legemidlets navn
    private static int tellerId = 0;  // Gir nye resepter en unik ID. Oeker med for hver nye resept
    public final int id;  // Dette legemidlets unike ID
    int pris;  // Legemidlets pris
    public final double virkestoff;  // Antall milligram med virkestoff legemidlet inneholder


    public Legemiddel(String navn, int pris, double virkestoff) {
        this.navn = navn;
        this.pris = pris;
        this.virkestoff = virkestoff;
        id = tellerId++;  // Stiger med 1 for hvert nye legemiddel-objekt
    }

    public int hentPrisen()
    {  // Returnerer produktets pris
        return pris;
    }

    public void settNyPris(int nyPris)
    {  // Gir legemidlet en ny pris
        pris = nyPris;
    }

    abstract public String toString();  // Abstrakt metode for å override utskriften av tekst i konsollen

}
