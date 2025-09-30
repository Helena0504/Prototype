package Prototype.granja;

import java.util.ArrayList;
import java.util.List;
import Prototype.animales.Animal;

public class Granja {
    //atributos
    private List<Animal> animales;

    //constructor
    public Granja() {
        this.animales = new ArrayList<>();
    }

    //metodos
    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    public void mostrarAnimales() {
        for (Animal animal : animales) {
            System.out.println(animal);
        }
    }

    public int contarAnimales() {
        return animales.size();
    }
}
