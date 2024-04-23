package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

    private String nom;
    private List<Item> items;

    /**
     * Constructeur
     *
     * @param nom
     */
    public Caisse(String nom) {
        super();
        this.nom = nom;
        this.items = new ArrayList<>();
    }

    /**
     * Détermine si la caisse peut accepter l'item en fonction de son poids.
     *
     * @param item L'item à évaluer.
     * @return true si la caisse peut accepter l'item, false sinon.
     */
    public boolean accepteItem(Item item) {
        // La caisse accepte l'item si son poids est inférieur à 5, 5-20, ou supérieur à 20 en fonction de la taille de la caisse
        switch (nom) {
            case "Petits objets":
                return item.getPoids() < 5;
            case "Moyens objets":
                return item.getPoids() >= 5 && item.getPoids() <= 20;
            case "Grands objets":
                return item.getPoids() > 20;
            default:
                return false; // Par défaut, la caisse ne peut pas accepter l'item
        }
    }

    /**
     * Getter pour l'attribut nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour l'attribut nom
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour l'attribut items
     *
     * @return the items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * Setter pour l'attribut items
     *
     * @param items the items to set
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

}
