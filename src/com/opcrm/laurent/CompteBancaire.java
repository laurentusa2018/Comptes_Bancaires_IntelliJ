package com.opcrm.laurent;

public class CompteBancaire {
    public String titulaire;
    public double solde;
    public String devise;

    public CompteBancaire(String titulaire, double leSolde, String laDevise) {
        this.titulaire = titulaire;
        solde = leSolde;
        devise = laDevise;
    }

    public void Crediter(double montant) {
        solde += montant;
    }

    public void Debiter(double montant) {
        solde -= montant;
    }

    public String Situation() {
        String description = "Le solde de " + this.titulaire + " est de " + this.solde +
                " " + this.devise;
        return description;
    }
}
