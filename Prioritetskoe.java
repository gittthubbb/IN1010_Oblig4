class Prioritetskoe<E extends Comparable <E>> extends Lenkeliste<E>{


    @Override
    public void leggTil(E x){

    Node nynode = new Node(x);


    if (stoerrelse() == 0 && forste == null) {
        forste = nynode;
        teller++;
        return;
    }
    Node peker = forste;
    if (nynode.innhold.compareTo(forste.innhold) < 0) {

        nynode.neste = forste;
        forste = nynode;
        teller++;
        return;
    }


    else if(nynode.innhold.compareTo(forste.innhold) > 0) {
        
        while (peker.neste != null && nynode.innhold.compareTo(peker.innhold) > 0){
            peker = peker.neste;
        }
        
        nynode.neste = peker.neste;
        peker.neste = nynode;
        teller++;
        return;
    }

    else { nynode.neste = peker.neste;
        peker.neste = nynode;
        teller++;
        return;

    }
    }

}
