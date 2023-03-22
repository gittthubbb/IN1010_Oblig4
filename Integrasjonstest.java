
class Integrasjonstest{
//Hovedprogrammet
    
    public static void main(String[] args) {
        
    
        Narkotisk narkotika = new Narkotisk("Heroin", 400, 200, 50);

        Vanedannende sobril = new Vanedannende("Sobril", 300, 100, 60);

        Vanlig melatonin = new Vanlig("Melatonin", 100, 20);

        Lege lege = new Lege("Per");

        Spesialist spesialist = new Spesialist("Karl", "kjd");

        HvitResept hvitresept = new HvitResept(narkotika, lege, 5, 3);

        MilResept milresept = new MilResept(sobril, lege, 6);

        PResept presept = new PResept(melatonin, lege, 4, 2);

        BlaaResept blaaresept = new BlaaResept(narkotika, spesialist, 2, 7);

        
        System.out.println(narkotika.toString()+ "\n");

        System.out.println(sobril.toString()+ "\n");

        System.out.println(melatonin.toString()+ "\n");

        System.out.println(lege.toString()+ "\n");

        System.out.println(spesialist.toString()+ "\n");

        System.out.println(hvitresept.toString()+ "\n");

        System.out.println(milresept.toString()+ "\n");

        System.out.println(presept.toString()+ "\n");

        System.out.println(blaaresept.toString()+ "\n");

        
        
}
}