package Prototype.granja;

import Prototype.animales.*;
import Prototype.prototype.RegistroPrototype;

public class Juego {
    //atributos
    private RegistroPrototype registro; //registro de prototipos
    private Granja granjaJugador;       //animales del jugador

    //constructor
    public Juego() {
        registro = new RegistroPrototype();
        granjaJugador = new Granja(); // solo la lista interna de animales
        inicializarPrototipos();
    }

    //metodos
    //inicializa prototipos
    private void inicializarPrototipos() {
        registro.annadirAnimal("vaca", new Vaca("Holstein", 3, "Blanco-negro", 1.5f, "Producir leche"));
        registro.annadirAnimal("oveja", new Oveja("Merina", 2, "Blanco", 1.0f, "Dar lana"));
        registro.annadirAnimal("gallina", new Gallina("Brahman", 1, "Marrón", 0.5f, "Poner huevos"));
    }

    //comprar animal = clona animal
    public void comprarAnimal(String tipoAnimal) {
        Animal clon = (Animal) registro.obtener(tipoAnimal); //se copia un clon del registro de prototipos
        if (clon != null) {
            granjaJugador.agregarAnimal(clon); //y se guarda en la granja del jugador
            System.out.println(tipoAnimal + " ha sido comprado y agregado a la granja.");
        } else {
            System.out.println("Tipo de animal no registrado.");
        }
    }

    //se ven los animales que ha comprado el jugador
    public void mostrarGranja() {
        granjaJugador.mostrarAnimales();
    }

    //main
    public static void main(String[] args) {
        Juego juego = new Juego();

        juego.comprarAnimal("vaca");
        juego.comprarAnimal("vaca");
        juego.comprarAnimal("oveja");
        juego.comprarAnimal("gallina");
        System.out.println("");

        // mostrar animales
        juego.mostrarGranja();
        System.out.println("");

        // pruebas prototype
        Animal vaca1 = (Animal) juego.registro.obtener("vaca"); //sacamos dos vacas del registro de prototipos
        Animal vaca2 = (Animal) juego.registro.obtener("vaca");

        System.out.println("Si vemos 2 vacas en el registro del prototipo...");
        System.out.println("No son la misma instancia");
        System.out.println("vaca1 == vaca2 ? " + (vaca1 == vaca2)); // no son la misma instancia
        System.out.println("");
        System.out.println("Pero si comparamos sus caracteristicas, son clones iguales");
        System.out.println("vaca1.getRaza().equals(vaca2.getRaza()) ? " + vaca1.getRaza().equals(vaca2.getRaza())); // true
        System.out.println("");

        // al modificar el clon el prototipo sigue siendo igual
        System.out.println("Al modificar el clon el prototipo sigue siendo igual");
        vaca1.setEdad(1);
        System.out.println("Ha modificado la edad de la vaca1");
        System.out.println("Edad modificada de nuestra vaca = " + vaca1.getEdad());
        System.out.println("");
        System.out.println("Las caracteristicas del prototipo no cambian");
        Animal vacaOriginal = (Animal) juego.registro.obtener("vaca");
        System.out.println("Edad del prototipo de vaca: " + vacaOriginal.getEdad());
    }
}



