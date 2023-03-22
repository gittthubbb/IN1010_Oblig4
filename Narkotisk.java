class Narkotisk extends Legemiddel{

    @Override
    public String toString() {
        return "Legemiddel: " + navn + ".   Pris: " + pris + ".  Mengde virkestoff: " + virkestoff + ".  Styrke: " + styrke; // skriver egenskapene
    }

    
    public final int styrke;

    public Narkotisk(String navn, int pris, double virkestoff, int styrke){
        super(navn, pris, virkestoff);
        this.styrke = styrke;
        

        

    }
}