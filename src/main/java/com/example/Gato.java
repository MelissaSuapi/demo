package com.example;

public class Gato extends Mascota {

    public Gato(String nombre, String especie, String raza, int edad, String tamaño, String color,
            String estadoDeSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoDeSalud);
       
    }

    @Override
    public void hacersonido() {
        System.out.println("EL gato Maulla");
        
    }

    @Override
    public void alimentar() {
        System.out.println("Croquetas");
      
        }
        
    

    @Override
    public void cuidar() {
        System.out.println("Comprar Arena mensual");
        
    }
}
        
    
   


