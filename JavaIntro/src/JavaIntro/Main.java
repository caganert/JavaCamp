package JavaIntro;

import java.util.prefs.Preferences;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World!");

        String midText = "İlginizi çekebilir";
        String bottomText = "Vade süresi";

        System.out.println(midText);

        int vade = 12;

        double dolarDun = 18.14;
        double dolarBugun = 18.20;

        boolean dolarDustuMu = true;

        String okYonu;

        if (dolarBugun<dolarDun){
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun>dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        String[] krediler = {"Hızlı Kredi", "Kredi X", "Kredi Y"};

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
    }
}
