package Prototype.animales;

public class Oveja extends Animal{
    //atributos
    private float cantidadLana;

    // constructores
    public Oveja(String raza, int edad, String color, float tamanno, String habilidadEspecial) {
        super(raza, edad, color, tamanno, habilidadEspecial);
    }

    public Oveja(String raza, int edad, String color, float tamanno, String habilidadEspecial, float cantidadLana) {
        super(raza, edad, color, tamanno, habilidadEspecial);
        this.cantidadLana = cantidadLana;
    }

    // getter
    public float getCantidadLana() {
        return cantidadLana;
    }

    //setter
    public void setCantidadLana(float cantidadLana) {
        this.cantidadLana = cantidadLana;
    }

    // metodos
    @Override
    public Animal clonar() {
        return new Oveja(this.raza, this.edad, this.color, this.tamanno, this.habilidadEspecial);
    }

    @Override
    public String toString() {
        return super.toString() + ", cantidadLana=" + cantidadLana;
    }    
}
