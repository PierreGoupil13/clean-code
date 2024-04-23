package ex1;
import java.time.LocalDate;

/**
 * Cette classe représente une entreprise avec ses informations de base.
 */
public class Entreprise {

    /**
     * Capital maximum autorisé pour une entreprise.
     */
    public static final int CAPITAL_MAX = 3000000;

    /**
     * Numéro SIRET de l'entreprise.
     */
    private int siret;

    /**
     * Nom de l'entreprise.
     */
    private String nom;

    /**
     * Adresse de l'entreprise.
     */
    private String adresse;

    /**
     * Date de création de l'entreprise.
     */
    private LocalDate dateCreation;

    /**
     * Obtient le numéro SIRET de l'entreprise.
     *
     * @return Le numéro SIRET de l'entreprise.
     */
    public int getSiret() {
        return siret;
    }

    /**
     * Définit le numéro SIRET de l'entreprise.
     *
     * @param siret Le numéro SIRET à définir.
     */
    public void setSiret(int siret) {
        this.siret = siret;
    }

    /**
     * Obtient le nom de l'entreprise.
     *
     * @return Le nom de l'entreprise.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom de l'entreprise.
     *
     * @param nom Le nom à définir.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Obtient l'adresse de l'entreprise.
     *
     * @return L'adresse de l'entreprise.
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Définit l'adresse de l'entreprise.
     *
     * @param adresse L'adresse à définir.
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * Obtient la date de création de l'entreprise.
     *
     * @return La date de création de l'entreprise.
     */
    public LocalDate getDateCreation() {
        return dateCreation;
    }

    /**
     * Définit la date de création de l'entreprise.
     *
     * @param dateCreation La date de création à définir.
     */
    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * Affiche le statut de l'entreprise.
     * Cette méthode n'a actuellement pas d'implémentation.
     */
    public void afficherStatut() {
        // Ajoutez ici l'implémentation pour afficher le statut de l'entreprise
        // par exemple : System.out.println("Statut de l'entreprise : ...");
    }
}


