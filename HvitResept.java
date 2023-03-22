class HvitResept extends Resept {
    @Override
    public String toString() {
        return "Legemiddel: " + legemiddel.navn + ".   Utskrivende lege: " + utskrivendeLege + ".  Pasient-id: " + ". Reit: " + reit; // skriver egenskapene
    }
    
    
    
    public HvitResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
        super(legemiddel, utskrivendeLege, pasientId, reit);
        
}
@Override
public String farge(){
    return "hvit";
    
}
@Override
public int prisAaBetale(){
        return this.legemiddel.hentPris();
}
}

