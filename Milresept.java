class MilResept extends HvitResept{
    @Override
    public String toString() {
        return "Legemiddel: " + legemiddel.navn + ".   Utskrivende lege: " + utskrivendeLege + ".  Pasient-id: " + pasientId; // skriver egenskapene
    }
    
    

    public MilResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId){
    super(legemiddel, utskrivendeLege, pasientId, 3); //hvordan kan super-konstruktøren kjøre uten alle paremterne(reit)?
    
    }

    @Override
    public String farge(){
        return "hvit";
    }

    @Override    
    public int prisAaBetale(){
        return 0; 
}
}