package Prototype.prototype;

import java.util.HashMap;
import java.util.Map;

public class RegistroPrototype {
    //atributos
    private Map<String, Prototype> items = new HashMap<>();

    //metodos
    public void annadirAnimal(String nombre, Prototype prototipo) {
        items.put(nombre, prototipo);
    }

    public Prototype obtener(String nombre) {
        Prototype prototipo = items.get(nombre);
        if (prototipo != null) {
            return prototipo.clonar();
        }
        return null;
    }
}
