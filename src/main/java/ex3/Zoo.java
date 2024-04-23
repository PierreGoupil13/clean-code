package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String nom;
    private List<Animal> animaux;


    public Zoo(String nom) {
        this.nom = nom;
        this.animaux = new ArrayList<>();
    }

    /**
     * Ajoute un nouvel animal au zoo.
     *
     * @param nomAnimal     Le nom de l'animal à ajouter.
     * @param typeAnimal    Le type de l'animal à ajouter (par exemple, MAMMIFERE, POISSON, SERPENT, etc.).
     * @param comportement  Le comportement de l'animal à ajouter (par exemple, CARNIVORE, HERBIVORE, etc.).
     * @param taille      La taille de l'animal.
     */
    public void addAnimal(String nomAnimal, TypeAnimal typeAnimal, ComportementAnimal comportement, Double taille) {
        Animal nouvelAnimal = new Animal(nomAnimal, typeAnimal, comportement, taille);
        animaux.add(nouvelAnimal);
    }

    /**
     * Affiche la liste des animaux présents dans le zoo.
     */
    public void afficherListeAnimaux() {
        System.out.println("Animaux dans le zoo " + nom + ":");
        for (Animal animal : animaux) {
            System.out.println(animal);
        }
    }

    /**
     * Getter for nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
