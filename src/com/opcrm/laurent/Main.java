package com.opcrm.laurent;

public class Main {

    public static void main(String[] args) {
        // write your code here
        CompteBancaire comptePierre = new CompteBancaire();

        comptePierre.titulaire = "Pierre";
        comptePierre.solde=0;
        comptePierre.devise="euros";

        System.out.println(comptePierre.Situation());

        comptePierre.Crediter(300);
        System.out.println(comptePierre.Situation());
        comptePierre.Debiter(500);
        System.out.println(comptePierre.Situation());



    }
}
