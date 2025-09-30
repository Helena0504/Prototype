package Prototype.animales;

public class Gallina extends Animal{
    //atributos
    private int cantidadHuevos;

    // constructores
    public Gallina(String raza, int edad, String color, float tamanno, String habilidadEspecial) {
        super(raza, edad, color, tamanno, habilidadEspecial);
    }

    public Gallina(String raza, int edad, String color, float tamanno, String habilidadEspecial, int cantidadHuevos) {
        super(raza, edad, color, tamanno, habilidadEspecial);
        this.cantidadHuevos = cantidadHuevos;
    }

    // getter
    public float getCantidadHuevos() {
        return cantidadHuevos;
    }

    //setter
    public void setCantidadHuevos(int cantidadHuevos) {
        this.cantidadHuevos = cantidadHuevos;
    }

    // metodos
    @Override
    public Animal clonar() {
        return new Gallina(this.raza, this.edad, this.color, this.tamanno, this.habilidadEspecial);
    }

    @Override
    public String toString() {
        return super.toString() + ", cantidadHuevos=" + cantidadHuevos;
    }    
    
}
