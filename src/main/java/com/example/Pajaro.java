package com.example;

public class Pajaro extends Mascota {

    public Pajaro(String nombre, String especie, String raza, int edad, String tamaño, String color,
            String estadoDeSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoDeSalud);
       
    }

    @Override
    public void hacersonido() {
       System.out.println("EL PAJARO TRINA");
        
    }

    @Override
    public void  alimentar() {
        System.out.println("frutas");
        
      
        
    }

    @Override
    public void  cuidar() {
        System.out.println("vitaminas para el plumaje");
        
       
        
    }

    

}
