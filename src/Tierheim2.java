package com.company;
public class Tierheim2 {
    public static void main(String[] args) {
        System.out.println("Wilkommen im glücklichen Tierheim!");
        // Hund Lessie - 20 kg - spielfreudig, löst Kriminalfälle
        double futterLessie;
        double ge = 20;
        futterLessie = berechneFuttermenge(ge);
        System.out.println("Lessie bekommt " + futterLessie + " kg Futter");
        // Unterschiedliche Varianten um das Gewicht um 1 kg zu erhoehen
        double x;
        x = ge++;
        System.out.println(x + " " + ge);
        // ge = ge + 1;
        // ge += 1;
        // ge++; ++ge;

        // fuettern am Abend
        futterLessie = berechneFuttermenge(ge);
        System.out.println("Lessie bekommt am Abend " + futterLessie + " kg Futter");


        //Aufrufen der Methode Bsp.a)

        double spazierLaenge = wieWeitSpazieren(0.9, 5, true);
        System.out.println("Hund geht " +spazierLaenge +"km");
        //Alternativ: sout(wieWeitSpazieren(9,5,true))

        //Aufrufen der Methode Bsp.b

       int[] kZeit = new int[]{10, 30, 60};
           System.out.println(kuschelBedarf(kZeit));

    }
    public static double berechneFuttermenge(double gewicht){
        double futterMenge;

        futterMenge = gewicht / 20;

        return futterMenge;
        // ganz kurz geschrieben
        // return gewicht / 20;
    }

    //hier kommt die Methode für Beispiel 3/a)

    public static double wieWeitSpazieren(double gewicht,double letztesMal, boolean vertraegtSich){

        if (gewicht < 1 && !vertraegtSich){
            return 2;
        }else if(gewicht<1 && vertraegtSich ){
            return 4;
        }else if((gewicht>15 || letztesMal>24) && vertraegtSich){
            return 8;
        }else{
            return 5;
        }

    }

    //hier kommt die Methode für Beispiel 3/b)

    public static boolean kuschelBedarf(int[] kuscheln){

        if ((kuscheln[0] + kuscheln[1] + kuscheln[2]) > 60){
            return false;
        }else if (kuscheln[0] < kuscheln[1] && kuscheln[1] < kuscheln[2]) {
            return true;
        }else if(kuscheln[1] > 25){
        }return true;
    }

}