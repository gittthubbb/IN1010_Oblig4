class Stabel<E> extends Lenkeliste<E>{
    


@Override
public void leggTil(E x) {
    Node nynode = new Node(x);

        if (forste == null) {
            forste = nynode;
            teller++;
            return;
        }
         
        nynode.neste = forste;
        forste = nynode;
        teller++;

    }
}


