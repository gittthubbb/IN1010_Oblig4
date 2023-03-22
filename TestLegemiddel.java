class TestLegemiddel{
    
   
   
        public static void narkotiskTest(){
        Narkotisk narkotisk = new Narkotisk("Heroin", 500, 10.0 , 400);

        if (narkotisk.ID == 0){
            System.out.println("\n ID-nummeret for narkotisk er riktig. \n"); 
        }
        else {System.out.println("\n ID-nummeret for narkotisk er feil. \n");}
        }

        public static void vanedannendeTest(){
        Vanedannende vanedannende = new Vanedannende("Nikotin", 300, 200, 100);
        if (vanedannende.ID == 1){
            System.out.println("ID-nummeret for vanedannende er riktig. \n");
        }
        else {System.out.println("ID-nummeret for vanedannende er feil. \n");}
        }

        public static void vanligTest(){
        Vanlig vanlig = new Vanlig("Koffein", 100, 300);
        if (vanlig.ID == 2){
            System.out.println("ID-nummeret for vanlig er riktig. \n");
        }
        else {System.out.println("ID-nummeret vanlig er feil.\n");}
        }

        public static void narkotisk2Test(){
        Narkotisk narkotisk2 = new Narkotisk("Heroin", 500, 10.0 , 400);

        if (narkotisk2.ID == 3){
            System.out.println("ID-nummeret for narkotisk2 er riktig. \n");
        }
        else {System.out.println("ID-nummeret for narkotisk2 er feil. \n");}
        }
public static void main(String[] args) {
    

    narkotiskTest();
    vanedannendeTest();
    vanligTest();
    narkotisk2Test();

    
   }



    }




