package com.opcrm.laurent;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        CompteBancaire comptePierre = new CompteBancaire("Pierre", 500, "euros");
/**
 *  Sans le constructeur
 comptePierre.titulaire = "Pierre";
 comptePierre.solde = 500;
 comptePierre.devise = "euros";
 */
        CompteBancaire comptePaul = new CompteBancaire("Paul", 150, "euros");
/** Sans le constructeur
 * comptePaul.titulaire = "Paul";
 *         comptePaul.solde = 150;
 *         comptePaul.devise = "euros";
 */


        System.out.println(comptePierre.Situation());
        System.out.println(comptePaul.Situation());
        System.out.println();

        comptePaul.setSolde(comptePaul.getSolde()-20);
        System.out.println(comptePaul.getDevise()+" "+comptePaul.getSolde());
        comptePaul.setDevise("livres");
        System.out.println(comptePierre.Situation());
        System.out.println(comptePaul.Situation());
        System.out.println();

        System.out.print("Entrer le montant du transfert de Pierre à Paul: ");
        Scanner sc = new Scanner(System.in);
        double montantTransfert = sc.nextDouble();

        comptePaul.Crediter(montantTransfert);
        comptePierre.Debiter((montantTransfert));
        System.out.println(comptePierre.Situation());
        System.out.println(comptePaul.Situation());


/**Application 1
 comptePierre.Crediter(300);
 System.out.println(comptePierre.Situation());
 comptePierre.Debiter(500);
 System.out.println(comptePierre.Situation());
 */

    }
}
