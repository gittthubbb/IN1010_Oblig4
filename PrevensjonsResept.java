public class PrevensjonsResept extends HvitResept{

    public PrevensjonsResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        super(legemiddel, utskrivendeLege, pasientId, reit);
    }

    public int prisAaBetale(Legemiddel legemiddel)
    {  // Returnerer prisen med et avslag på 108kr. Aldri lavere enn 0kr.
        int pris = legemiddel.pris - 108;

        return Math.max(pris, 0);  // Hvis pris er lavere enn 0, returneres 0
    }
}
