package com.opcrm.laurent;

public class CompteBancaire {
    private String titulaire;
    private double solde;
    private String devise;

    public CompteBancaire(String titulaire, double solde, String laDevise) {
        this.titulaire = titulaire;
        this.solde=solde;
        //setSolde(leSolde);
        setDevise(laDevise);
    }


    public void Crediter(double montant) {
        setSolde(getSolde() + montant);
    }

    public void Debiter(double montant) {
        setSolde(getSolde() - montant);
    }

    public String Situation() {
        String description = "Le solde de " + this.titulaire + " est de " + this.getSolde() +
                " " + this.getDevise();
        return description;
    }

    /**
     * Mise en place des accésseurs
     * @return
     */

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
