package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    private List<Caisse> caisses;

    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets"));
        caisses.add(new Caisse("Moyens objets"));
        caisses.add(new Caisse("Grands objets"));
    }

    /**
     * Ajoute un item à la caisse appropriée dans l'inventaire.
     *
     * @param item L'item à ajouter.
     */
    public void addItem(Item item) {
        // Itération sur chaque caisse
        for (Caisse caisse : caisses) {
            // Si la caisse accepte l'item, on l'ajoute et on quitte la boucle
            if (caisse.accepteItem(item)) {
                caisse.getItems().add(item);
                break;
            }
        }
    }

    /**
     * Calcule et retourne le nombre total d'items dans toutes les caisses de l'inventaire.
     *
     * @return Le nombre total d'items dans l'inventaire.
     */
    public int taille() {
        int total = 0;
        // Calcul de la taille totale en itérant sur chaque caisse
        for (Caisse caisse : caisses) {
            total += caisse.getItems().size();
        }
        return total;
    }
}
