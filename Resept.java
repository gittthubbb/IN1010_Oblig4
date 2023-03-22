abstract class Resept {
    
    
    public Legemiddel legemiddel;
    public Lege utskrivendeLege;
    public int pasientId;   
    public int reit;
    public final int ID;
    private static int teller = 0;


    protected Resept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
        this.legemiddel = legemiddel;
        this.utskrivendeLege = utskrivendeLege;
        this.pasientId = pasientId;
        this.reit = reit;
        ID = teller;
        teller++;
    }

    public int hentId(){
        return ID; // må det være this.ID her?
    }

    public Legemiddel hentLegemiddel(){
        return legemiddel;
    }

    public Lege hentLege(){
        return utskrivendeLege;
    }

    public int hentPasientId() {
        return pasientId;
    }

    public int hentReit() {
        return reit;
    }

    public boolean bruk(){
        if(reit > 0){
            reit--;
            return true;
        }
        return false;  
    }

    abstract public String farge();
    

    abstract public int prisAaBetale();
        
    






}