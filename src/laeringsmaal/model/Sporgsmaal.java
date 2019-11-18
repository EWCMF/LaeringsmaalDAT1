/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 15/11/2019
 */
package model;

import java.util.ArrayList;

public class Sporgsmaal {

    private String[][] alleSporgsmaal = new String[11][5];

    public Sporgsmaal() {

        alleSporgsmaal[0][0] = "Forklar hvordan man erklærer og benytter variable i java.";
        alleSporgsmaal[0][1] = "Vis et eksempel på erklæring og initialisering af hhv. en instansvariabel, klassevariabel og en lokal variabel.";
        alleSporgsmaal[0][2] = "Forklar hvilke datatyper, der er i Java.";
        alleSporgsmaal[0][3] = "Vis et eksempel på typecasting fra double til int.";

        alleSporgsmaal[1][0] = "Forklar sammenhæng mellem klasser og objekter i java.";
        alleSporgsmaal[1][1] = "Vis eksempler på oprettelse af et objekt og anvendelse af objektet.";

        alleSporgsmaal[2][0] = "Vis og forklar hvilke elementer en javaklasse består af.";

        alleSporgsmaal[3][0] = "Hvilke kontrolstrukturer findes i java?";
        alleSporgsmaal[3][1] = "Vis eksempel på hhv. en if/else og en for-løkke eller en while-løkke.";

        alleSporgsmaal[4][0] = "Forklar hvad arrays er, og hvordan de kan anvendes i et javaprogram.";
        alleSporgsmaal[4][1] = "Vis et eksempel på oprettelse af et array, og efterfølgende gennemløb af arrayet.";
        alleSporgsmaal[4][2] = "Vis hvordan man hhv. indsætter data og trækker data ud af arrayet.";
        alleSporgsmaal[4][3] = "Vis eksempel på oprettelse af en ArrayListe og gennemløb af den.";
        alleSporgsmaal[4][4] = "Sammenlign arrays og ArrayLists.";

        alleSporgsmaal[5][0] = "Vis et eksempel på en GUI.";
        alleSporgsmaal[5][1] = "Forklar, hvordan JavaFX virker.";
        alleSporgsmaal[5][2] = "Vis et eksempel på et GUI-projekt i IntelliJ.";

    }


    public String getSporgsmaal(int i, int j) {
        return alleSporgsmaal[i][j];
    }

    public void setSporgsmaal(int i, int j, String sporgsmaal) {
        alleSporgsmaal[i][j] = sporgsmaal;
    }

    public int getLastIndexOf(int i) {
        return alleSporgsmaal[i].length - 1;
    }

}
