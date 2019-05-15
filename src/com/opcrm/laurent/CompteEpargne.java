package com.opcrm.laurent;

public class CompteEpargne extends CompteBancaire {
    private double taux;

    public CompteEpargne(String titulaire, double solde, String devise, double taux) {
        super(titulaire, solde, devise);
        this.setTaux(taux);
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public void AjouterInterets(){
        double interets=this.solde*taux;
        this.solde+=interets;
    }
}

