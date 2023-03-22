class TestResepter{

    public static void hvitReseptTest(){
        Narkotisk narkotisk = new Narkotisk("Heroin", 500, 10.0 , 400);
        Lege lege = new Lege("Per");
        HvitResept hvitresept = new HvitResept(narkotisk, lege, 5, 3);
        
        if (hvitresept.hentId() == 0){
            System.out.println("\n ID-nummeret for hvitresept er riktig.");
        }
        else {System.out.println("\n ID-nummeret for hvitresept er feil.");}

        if (hvitresept.farge() == "hvit") {
            System.out.println("Riktig reseptfarge.");
        }
        else {System.out.println("Feil reseptfarge.");}
        

        if (hvitresept.prisAaBetale() == 500) {
            System.out.println("Riktig pris. \n");
        }
        else {System.out.println("Feil pris. \n");}
    }
    
    public static void milReseptTest(){
        Narkotisk narkotisk = new Narkotisk("Heroin", 500, 10.0 , 400);
        Lege lege = new Lege("Per");
        MilResept milresept = new MilResept(narkotisk, lege, 5);
        
        if (milresept.ID == 1){
            System.out.println("ID-nummeret for milresept er riktig.");
        }
        else {System.out.println("ID-nummeret for milresept er feil.");}

        if (milresept.farge() == "hvit") {
            System.out.println("Riktig reseptfarge.");
        }
        else {System.out.println("Feil reseptfarge.");}
        

        if (milresept.prisAaBetale() == 0)  { //gratis legemidler for milresept
            System.out.println("Riktig pris.  \n");
        }
        else {System.out.println("Feil pris.  \n");}
    }

    public static void pReseptTest(){
        Narkotisk narkotisk = new Narkotisk("Heroin", 500, 10.0 , 400);
        Lege lege = new Lege("Per");
        PResept presept = new PResept(narkotisk, lege, 5, 4);
        
        if (presept.ID == 2){
            System.out.println("ID-nummeret for presept er riktig.");
        }
        else {System.out.println("ID-nummeret for presept er feil.");}

        if (presept.farge() == "hvit") {
            System.out.println("Riktig reseptfarge.");
        }
        else {System.out.println("Feil reseptfarge.");}
        

        if (presept.prisAaBetale() == 392)  { 
            System.out.println("Riktig pris. \n");
        }
        else {System.out.println("Feil pris. \n");}
    }

    public static void blaaReseptTest(){
        Narkotisk narkotisk = new Narkotisk("Heroin", 500, 10.0 , 400);
        Lege lege = new Lege("Per");
        BlaaResept blaaresept = new BlaaResept(narkotisk, lege, 5, 4);
        
        if (blaaresept.ID == 3){
            System.out.println("ID-nummeret for blaaresept er riktig.");
        }
        else {System.out.println("ID-nummeret for blaaresept er feil.");}

        if (blaaresept.farge() == "blaa") {
            System.out.println("Riktig reseptfarge.");
        }
        else {System.out.println("Feil reseptfarge.");}
        

        if (blaaresept.prisAaBetale() == 125)  { 
            System.out.println("Riktig pris. \n");
        }
        else {System.out.println("Feil pris. \n");}
    }



        public static void main(String[] args) {
            
            hvitReseptTest();
            milReseptTest();
            pReseptTest();
            blaaReseptTest();

        }
}