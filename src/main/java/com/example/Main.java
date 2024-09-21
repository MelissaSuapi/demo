package com.example;

public class Main {
    public static void main(String[] args) {
        Perro perro1= new Perro("Lorenzo", "perro", "golden retriver", 10, "mediano", "dorado", "excelente");
        Gato gato1= new Gato("Paolo", "gato", "Persa", 7, "mediano ", "cafe ", "excelente");
        Pajaro pajaro1 = new Pajaro("Pacho", "pajaron", "canario", 4, "pequeño", "amarillo", "excelente");
        Tortuga tortuga1 = new Tortuga("cometa", "quelonios", "lora", 12, "medianos", "verde", "excelente");


        perro1.hacersonido();
        perro1.alimentar();
        perro1.cuidar();
        perro1.mostrarInformacion();

        gato1.alimentar();
        gato1.hacersonido();
        gato1.cuidar();
        gato1.mostrarInformacion();

        pajaro1.alimentar();
        pajaro1.cuidar();
        pajaro1.hacersonido();
        pajaro1.mostrarInformacion();

        tortuga1.alimentar();
        tortuga1.cuidar();
        tortuga1.hacersonido();
        tortuga1.mostrarInformacion();
        
        }
}