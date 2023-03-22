import java.util.Iterator;
abstract class Lenkeliste <E> implements Liste <E>{
    Node forste = null;
    int teller = 0;

    class Node{

        Node neste = null;
        E innhold;

        public Node(E innhold){
            this.innhold = innhold;
        }
        public E hentInnhold(){
            return innhold;
        }
    }

    private class LenkelisteIterator implements Iterator<E>{
        private Lenkeliste<E> liste;  
        private int index = 0;

        public LenkelisteIterator(Lenkeliste<E> L){
            liste = L;
        }
        
        @Override
        public boolean hasNext(){
            return index < liste.stoerrelse();
        }
        @Override
        public E next(){
            return liste.hentpaindex(index++);
        }
    
    }


    public Iterator<E> iterator(){
        LenkelisteIterator ny = new LenkelisteIterator(this);
        return ny;
    }

    public E hentpaindex(int indeks) throws UgyldigListeindeks{
           int index = indeks;
        if (index == 0) {
            throw new UgyldigListeindeks(0);
        }
        Node peker = forste;
        for (int i = 0; i < index; i++){
            peker = peker.neste;
        }
        return peker.innhold;
    }

    public int stoerrelse() {
        // int teller = 1;
        // Node node = forste;
        // if (forste == null){
        //     return 0;
        // }
        // while(node.neste != null ){
        //     node = node.neste;
        //     teller++;
        // }
        return teller;

    }

    public void leggTil(E x){

        Node nynode = new Node(x);

        if (forste == null) {
            forste = nynode;
            teller++;
            return;
        }

        Node peker = forste;
        while (peker.neste != null){
                peker = peker.neste;
        }

        peker.neste = nynode;
        teller++;
    }


    public E hent(){
        return forste.innhold;
    }

    public E fjern() throws UgyldigListeindeks{
        Node peker = forste;
        if (stoerrelse() == 0) {
            throw new UgyldigListeindeks(0);
        }


        if (stoerrelse() == 1){
            forste = null;
            teller--;
            return peker.innhold;

        }
        else {
            forste = forste.neste;
            teller--;
            return peker.innhold;


        }

    }
    @Override
    public String toString(){
        Node peker = forste;
        String info = "";

        //info += forste.innhold;

        while (peker != null){
            info += (peker.innhold + "\n");
            peker = peker.neste;
        }

        return info;
    }
}
