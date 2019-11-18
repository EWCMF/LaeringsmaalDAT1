import model.Emner;
import model.Sporgsmaal;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 15/11/2019
 */


public class StartConsol {

    public static void main(String[] args) {

        System.out.println("Læringsmåls-applikation");

        // Emner

        Emner emner = new Emner();

        int antalMaal = emner.getEmner().length;

        System.out.println("Der er " + antalMaal);

        emner.setEmne(11, "Metoder");

        for (int i = 0; i < antalMaal; i++) {
            System.out.println(emner.getEmne(i));
        }

        // Spørgsmål

        Sporgsmaal sporgsmaal = new Sporgsmaal();

        System.out.println(sporgsmaal.getSporgsmaal(0, 0));


    }
}
