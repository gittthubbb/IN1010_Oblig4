public class Lege {
    private String navn;  // Legens navn
    public Lege(String navn) {
        this.navn = navn;
    }
    public String hentNavn()
    {  // Returnerer legens navn
        return navn;
    }

    public String toString()
    {  // Override for aa presentere informasjon om legen
        return  "\nLEGE:" +
                "\nNavn: " + hentNavn();
    }
}
