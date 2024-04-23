package ex3;

public class ZooApplication {

    public static void main(String[] args) {
        Zoo zoo = new Zoo("Thoiry");

        zoo.addAnimal("Gazelle", TypeAnimal.MAMMIFERE, ComportementAnimal.HERBIVORE, 1.5);
        zoo.addAnimal("Zèbre", TypeAnimal.MAMMIFERE, ComportementAnimal.HERBIVORE, 1.7);
        zoo.addAnimal("Lion", TypeAnimal.MAMMIFERE, ComportementAnimal.HERBIVORE, 1.8);
        zoo.addAnimal("Panthère", TypeAnimal.MAMMIFERE, ComportementAnimal.CARNIVORE, 1.2);
        zoo.addAnimal("Requin blanc", TypeAnimal.POISSON, ComportementAnimal.HERBIVORE, 2.0);
        zoo.addAnimal("Truite dorée", TypeAnimal.POISSON, ComportementAnimal.HERBIVORE, 0.5);
        zoo.addAnimal("Boa constrictor", TypeAnimal.SERPENT, ComportementAnimal.CARNIVORE, 1.5);
        zoo.addAnimal("Python", TypeAnimal.SERPENT, ComportementAnimal.CARNIVORE, 2.2);

    }

}
