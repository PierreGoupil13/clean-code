package ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 */
public class CompteBancaire {

    private static final String TYPE_CC = "CC";
    private static final String TYPE_LA = "LA";

    /**
     * solde : solde du compte
     */
    private double solde;

    /**
     * decouvert : un découvert est autorisé seulement pour les comptes courants
     */
    private double decouvert;

    /**
     * tauxRemuneration : taux de rémunération dans le cas d'un livret A
     */
    private double tauxRemuneration;

    /**
     * Le type vaut soit CC=Compte courant, ou soit LA=Livret A
     */
    private String type;

    /**
     * @param type             Le type du compte (CC ou LA)
     * @param solde            Le solde initial du compte
     * @param decouvert        Le découvert autorisé pour les comptes courants
     * @param tauxRemuneration Le taux de rémunération pour les livrets A
     */
    public CompteBancaire(String type, double solde, double decouvert, double tauxRemuneration) {
        this.type = type;
        this.solde = solde;
        this.decouvert = (type.equals(TYPE_CC)) ? decouvert : 0; // Le découvert est autorisé seulement pour les comptes courants
        this.tauxRemuneration = (type.equals(TYPE_LA)) ? tauxRemuneration : 0; // Le taux de rémunération est applicable seulement pour les livrets A
    }

    /**
     * Ajoute un montant au solde
     *
     * @param montant
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /**
     * Débite un montant du solde
     *
     * @param montant Le montant à débiter
     */
    public void debiterMontant(double montant) {
        if (type.equals(TYPE_CC)) {
            if (montant <= solde + decouvert) {
                solde -= montant;
            }
        } else if (type.equals(TYPE_LA)) {
            if (montant <= solde) {
                solde -= montant;
            }
        }
    }

    /**
     * Applique la rémunération annuelle pour les livrets A
     */
    public void appliquerRemunerationAnnuelle() {
        if (type.equals(TYPE_LA)) {
            solde += solde * tauxRemuneration / 100;
        }
    }

    /**
     * Getter for solde
     *
     * @return the solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Setter
     *
     * @param solde the solde to set
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * Getter for decouvert
     *
     * @return the decouvert
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * Setter
     *
     * @param decouvert the decouvert to set
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    /**
     * Getter for tauxRemuneration
     *
     * @return the tauxRemuneration
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /**
     * Setter
     *
     * @param tauxRemuneration the tauxRemuneration to set
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Getter for type
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter
     *
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
}
