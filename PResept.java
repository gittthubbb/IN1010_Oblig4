class PResept extends HvitResept{

    @Override
    public String toString() {
        return "Legemiddel: " + legemiddel.navn + ".   Utskrivende lege: " + utskrivendeLege + ".  Pasient-id: " + pasientId + ". Reit: " + reit; // skriver egenskapene
    }

    

    public PResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
        super(legemiddel, utskrivendeLege, pasientId, reit);
        
    }

    @Override
    public String farge(){
        return "hvit";
    }

    @Override
    public int prisAaBetale(){
        if (this.legemiddel.hentPris()-108 > 0){
            return this.legemiddel.hentPris()-108;
        }
        else {return 0;}
}
}