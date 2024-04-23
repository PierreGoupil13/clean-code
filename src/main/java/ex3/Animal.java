package ex3;

/**
 * Représente un animal dans un zoo.
 */
public class Animal {

    private String nom;
    private TypeAnimal type;
    private ComportementAnimal comportement;
    private double taille;

    /**
     * Constructeur pour créer un nouvel animal.
     *
     * @param nom         Le nom de l'animal.
     * @param type        Le type d'animal (par exemple, MAMMIFERE, POISSON, SERPENT, etc.).
     * @param comportement Le comportement de l'animal (par exemple, CARNIVORE, HERBIVORE, etc.).
     * @param taille      La taille de l'animal.
     */
    public Animal(String nom, TypeAnimal type, ComportementAnimal comportement, Double taille) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
        this.taille = taille;
    }

    /**
     * Obtient le nom de l'animal.
     *
     * @return Le nom de l'animal.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom de l'animal.
     *
     * @param nom Le nom à définir.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Obtient le type d'animal.
     *
     * @return Le type d'animal.
     */
    public TypeAnimal getType() {
        return type;
    }

    /**
     * Définit le type d'animal.
     *
     * @param type Le type à définir.
     */
    public void setType(TypeAnimal type) {
        this.type = type;
    }

    /**
     * Obtient le comportement de l'animal.
     *
     * @return Le comportement de l'animal.
     */
    public ComportementAnimal getComportement() {
        return comportement;
    }

    /**
     * Définit le comportement de l'animal.
     *
     * @param comportement Le comportement à définir.
     */
    public void setComportement(ComportementAnimal comportement) {
        this.comportement = comportement;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'animal.
     *
     * @return Une chaîne de caractères représentant l'animal.
     */
    @Override
    public String toString() {
        return nom + " - " + type + " - " + comportement;
    }
}
