class Hovedprogram2{

    public static void main(String[] args) {
        

        IndeksertListe<String> test = new IndeksertListe<>();

        test.leggTil("A");
        test.leggTil("B");
        test.leggTil("C");
        test.fjern();
        test.sett(1,"D");

        System.out.println(test);


    }
}