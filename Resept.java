abstract class Resept {

    private static int tellerId;  // Gir nye resepter en unik ID. Oeker med for hver nye resept
    public final int reseptId;  // Denne reseptens unike ID
    Legemiddel legemiddel;  // Legemidlet denne resepten gjelder
    private final Lege utskrivendeLege;  // Lege som har skrevet resepten
    private final int pasientId;  // Pasientens unike ID
    private int reit;  // Antall ganger resepten kan brukes foer den er ugyldig


    public Resept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit)
    {
        this.legemiddel = legemiddel;
        this.utskrivendeLege = utskrivendeLege;
        this.pasientId = pasientId;
        this.reit = reit;
        reseptId = tellerId++;  // Stiger med 1 for hvert nye resept-objekt
    }

    public int hentId()
    {  // Returnerer reseptens ID
        return reseptId;
    }

    public Legemiddel hentLegemiddel()
    {  // Returnerer infomasjon om legemidlet på resepten
        return legemiddel;
    }

    public Lege hentLege()
    {  // Returnerer navnet på legen som har laget resepten
        return utskrivendeLege;
    }

    public int hentPasientId()
    {  // Returnerer pasientens ID
        return pasientId;
    }

    public int hentReit()
    {   // Returnerer antall reiterasjon på resepten
        return reit;
    }

    public boolean bruk()
    {   // Returnerer true hvis resepten kan brukes. False den ikke er gyldig,
        return reit > 0;
    }

    abstract public String farge();  // Abstrakt metode for å returnere fargen på resepten


    abstract public int prisAaBetale(Legemiddel legemiddel);
    // Abstrakt metode som gir riktig prisen på legemidlet med hensyn til resepten


    public String toString()
    {  // Override for aa presentere informasjon om resepten
        return  "\nRESEPT:" +
                "\nReseptID: " + hentId() +
                "\nPasientID: " + hentPasientId() +
                "\nReit: " + hentReit() +
                "\nGyldig: " + bruk() +
                "\nType: " + farge() +
                "\nPris aa betale: " + prisAaBetale(hentLegemiddel()) + ",-"+
                "\n" + hentLegemiddel() +
                "\n" + hentLege();
    }
}
