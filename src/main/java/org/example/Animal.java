package org.example;

public class Animal {

    public String nombre;
    public String genero;
    double peso;
    Animal pareja;


    public Animal(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public Animal() {

    }

    public void encontrarPareja(Animal pareja){
        this.pareja=pareja;
    }






}
