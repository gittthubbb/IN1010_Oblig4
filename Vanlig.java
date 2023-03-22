class Vanlig extends Legemiddel{

    @Override
    public String toString() {
        return "Legemiddel: " + navn + ".   Pris: " + pris + ".  Mengde virkestoff: " + virkestoff; // skriver egenskapene
    }

    

    public Vanlig(String navn, int pris, double virkestoff){
        super(navn, pris, virkestoff);
        
    }
    
}