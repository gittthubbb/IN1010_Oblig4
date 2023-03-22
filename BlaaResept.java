public class BlaaResept extends Resept{
    public BlaaResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        super(legemiddel, utskrivendeLege, pasientId, reit);
    }

    @Override
    public String farge()
    {  // Returnerer fargen på resepten
        return "blaa";
    }

    @Override
    public int prisAaBetale(Legemiddel legemiddel)
    {  // En rabatt paa 75%
        return (int)Math.round(legemiddel.pris * 0.25);
    }
}
