class Lege {
    
    @Override
    public String toString() {
        return "Legenavn:" + legeNavn; // skriver egenskapene
    }

    public String legeNavn;

    public Lege(String legenavn){
        legeNavn = legenavn;
    }

    public String hentNavn() {
        return legeNavn;
    }

}