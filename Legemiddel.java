abstract class Legemiddel{
    
    public final String navn;
    public int pris;
    public final double virkestoff;
    public final int ID;
    private static int teller = 0;


    protected Legemiddel(String navn, int pris, double virkestoff){
        this.navn = navn;
        this.pris = pris;
        this.virkestoff = virkestoff;
        ID = teller;
        teller++;

    }

    public int hentPris(){
        return pris;
    }

    public void settNyPris(int nyPris){
        pris = nyPris;
    }
}

