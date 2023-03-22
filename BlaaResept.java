import java.lang.Math;

class BlaaResept extends Resept{

    @Override
    public String toString() {
        return "Legemiddel: " + legemiddel.navn + ".   Utskrivende lege: " + utskrivendeLege + ".  Pasient-id: "+ pasientId + ". Reit: " + reit; // skriver egenskapene
    }

    


    public BlaaResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
        super(legemiddel, utskrivendeLege, pasientId, reit);
       
    }

    @Override
    public String farge(){
        return "blaa";
        
    }
    @Override
    public int prisAaBetale(){
        return (int)Math.round(0.25 * this.legemiddel.hentPris()); //er dette riktig?
}

}