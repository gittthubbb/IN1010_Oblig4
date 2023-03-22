class IndeksertListe<E> extends Lenkeliste<E> {
    
   


    public void leggTil(int pos, E x ) throws UgyldigListeindeks{
        //super(x);

    Node nynode = new Node(x);
        
    if (pos < 0 || pos > stoerrelse())
    {throw new UgyldigListeindeks(pos);}

    if (forste == null) {
        forste = nynode;
        teller++;
        return;
    }
    if (pos == 0 ){
        nynode.neste = forste;
        forste = nynode;
        teller++;
        return;

    }
    else if (pos == stoerrelse()) {
        Node peker = forste;
        
        while (peker.neste != null){
            peker = peker.neste;
        
        }
        peker.neste = nynode;
        teller++;
        return;

    }

    Node peker1 = forste;
    for (int i = 0; i < pos-1; i++){
        peker1 = peker1.neste;
    }
    
    nynode.neste = peker1.neste;
    peker1.neste = nynode;
    teller++;
    
    


    }

    public void sett (int pos, E x) throws UgyldigListeindeks{

    if (pos < 0 || pos > stoerrelse()-1)
     {throw new UgyldigListeindeks(pos);}
   
    Node peker = forste;
    for (int i = 0; i < pos; i++){
        peker = peker.neste;
    }
    peker.innhold = x;
   
    }

    
    public E hent (int pos) throws UgyldigListeindeks{
        if (pos < 0 || pos > stoerrelse())
     {throw new UgyldigListeindeks(pos);}
        
     if (forste == null) {        
        throw new UgyldigListeindeks(pos);}

   
        Node peker = forste;
        for (int i = 0; i < pos; i++){
            peker = peker.neste;
        }
        return peker.innhold;
    }


    


    public E fjern (int pos) throws UgyldigListeindeks{

    
    if (pos < 0 || pos > stoerrelse()-1)
    {throw new UgyldigListeindeks(pos);
    }

    Node peker = forste;
    for (int i = 0; i < pos-1; i++){
        peker = peker.neste;
    }
    E lagring = peker.neste.innhold;
    peker.neste = peker.neste.neste;
    teller--;
    return lagring;
    }
}

