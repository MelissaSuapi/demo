package com.example;

public class Tortuga extends Mascota {

    public Tortuga(String nombre, String especie, String raza, int edad, String tamaño, String color,
            String estadoDeSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoDeSalud);
      
    }

    @Override
    public void hacersonido() {
        System.out.println("La trotuga realiza gruñidos");
    }

    @Override
    public void alimentar() { 
        System.out.println("Alimentar con pescado");
        

    }
       

    @Override
    public void cuidar() {
        System.out.println( "Limpieza del agua");
        
        
    }

   

}
