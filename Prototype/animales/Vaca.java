package Prototype.animales;

public class Vaca extends Animal {
    // atributos
    private float cantidadLeche;

    // constructores
    public Vaca(String raza, int edad, String color, float tamanno, String habilidadEspecial) {
        super(raza, edad, color, tamanno, habilidadEspecial);
    }

    public Vaca(String raza, int edad, String color, float tamanno, String habilidadEspecial, float cantidadLeche) {
        super(raza, edad, color, tamanno, habilidadEspecial);
        this.cantidadLeche = cantidadLeche;
    }

    // getter
    public float getCantidadLeche() {
        return cantidadLeche;
    }

    //setter
    public void setCantidadLeche(float cantidadLeche) {
        this.cantidadLeche = cantidadLeche;
    }

    // metodos
    @Override
    public Animal clonar() {
        return new Vaca(this.raza, this.edad, this.color, this.tamanno, this.habilidadEspecial);
    }

    @Override
    public String toString() {
        return super.toString() + ", cantidadLeche=" + cantidadLeche;
    }    
}
    
