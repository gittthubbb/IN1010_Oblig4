public class Spesialist extends Lege implements Godkjenningsfritak {

    private final String kontrollkode;  // Legens (spesialistens) unike kontrollkode

    public Spesialist(String navn, String kontrollkode) {
        super(navn);
        this.kontrollkode = kontrollkode;
    }

    @Override
    public String hentKontrollkode()
    {  // Returnerer kontrollkoden fra interfacet Godkjenningsfritak
        return kontrollkode;
    }

    public String toString()
    {  // Override for aa presentere informasjon om spesialisten
        return  "\nLEGE - SPESIALIST:" +
                "\nNavn: " + hentNavn() +
                "\nKontrollkode: " + kontrollkode;
    }
}
