public class HvitResept extends Resept{
    public HvitResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        super(legemiddel, utskrivendeLege, pasientId, reit);
    }

    @Override
    public String farge()
    {  // Returnerer fargen på resepten
        return "hvit";
    }

    @Override
    public int prisAaBetale(Legemiddel legemiddel)
    {  // Ordinaer pris
        return legemiddel.pris;
    }
}
