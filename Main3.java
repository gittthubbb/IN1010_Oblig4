class Main3{
    public static void main(String[] args) {
        
        Prioritetskoe<Integer> f = new Prioritetskoe<Integer>();
        f.leggTil(3);
        System.out.println(f.toString());
        f.leggTil(4);
        System.out.println(f.toString());
        f.leggTil(5);
        System.out.println(f.toString());
        f.fjern();
        System.out.println(f.toString());
        f.fjern();
        System.out.println(f.toString());
        f.fjern();
        System.out.println(f.toString());
        
           
    }

}