
import java.lang.Iterable;

interface Liste <E> extends Iterable {
    int stoerrelse  ();
    void leggTil (E x);
    E hent ();
    E fjern ();
}