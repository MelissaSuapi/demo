package com.example;

public class Perro extends Mascota{

    public Perro(String nombre, String especie, String raza, int edad, String tamaño, String color,
            String estadoDeSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoDeSalud);
       
    }

    @Override
    public void hacersonido() {
        System.out.println("EL PERRO LADRA");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimento balanceado");
    }

    @Override
    public void cuidar() {
        System.out.println("Bañar cada mes");
        
    }

}
