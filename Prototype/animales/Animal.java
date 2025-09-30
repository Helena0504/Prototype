package Prototype.animales;

import Prototype.prototype.Prototype;

public class Animal implements Prototype {
    // atributos
    protected String raza;
    protected int edad;
    protected String color;
    protected float tamanno;
    protected String habilidadEspecial;

    //constructor
    public Animal(String raza, int edad, String color, float tamanno, String habilidadEspecial) {
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.tamanno = tamanno;
        this.habilidadEspecial = habilidadEspecial;
    }

    //getters
    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getColor() {
        return color;
    }

    public float getTamanno() {
        return tamanno;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    //setters
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTamanno(float tamanno) {
        this.tamanno = tamanno;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }


    //metodos
    @Override
    public Prototype clonar() {
        return new Animal(this.raza, this.edad, this.color, this.tamanno, this.habilidadEspecial);
    }

    @Override
    public String toString() {
        return "Animal [raza=" + raza + ", edad=" + edad + ", color=" + color + ", tamanno=" + tamanno
                + ", habilidadEspecial=" + habilidadEspecial + "]";
    }

    
}
