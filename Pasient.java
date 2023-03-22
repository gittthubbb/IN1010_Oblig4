class Pasient {
    public final String navn;
    public final String fodselsNr;
    public final int ID;
    private static int teller = 0;




    public Pasient(String navn, String fodselsNr){
        this.navn = navn;
        this.fodselsNr = fodselsNr;
        ID = teller;
        teller++;
    }
    
}