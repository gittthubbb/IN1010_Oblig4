class Spesialist extends Lege implements Godkjenningsfritak {

@Override
public String toString() {
    return "Spesialistnavn: " + legeNavn + ".   Kontrollkode: " + kontrollkode; // skriver egenskapene
}
public String kontrollkode;



public Spesialist(String legenavn, String kontrollkode) {
    super(legenavn);
    this.kontrollkode = kontrollkode;

}

public String hentKontrollkode(){
    return kontrollkode;
}


    
}