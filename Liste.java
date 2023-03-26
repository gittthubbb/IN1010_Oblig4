
import java.lang.Iterable;
// test
interface Liste <E> extends Iterable {
    int stoerrelse  ();
    void leggTil (E x);
    E hent ();
    E fjern ();
}