package com.example;

public abstract class Mascota {
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private String tamaño;
    private String color;
    private String estadoDeSalud;

public Mascota(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoDeSalud) {
        this.nombre= nombre;
        this.especie=especie;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
        this.color = color;
        this.estadoDeSalud = estadoDeSalud;

}


public String getNombre() {
    return nombre;
}


public String getEspecie() {
    return especie;
}


public String getRaza() {
    return raza;
}


public int getEdad() {
    return edad;
}


public String getTamaño() {
    return tamaño;
}


public String getColor() {
    return color;
}


public String getEstadoDeSalud() {
    return estadoDeSalud;
}


// Métodos abstractos:
public abstract void hacersonido();
public abstract void alimentar();
public abstract void cuidar();

public void mostrarInformacion() {
    System.out.println("Nombre de la mascota: " + nombre);
    System.out.println("Especie de la mascota: " + especie);
    System.out.println("Raza Mascota: " +raza);
    System.out.println("Edad de la Mascota: " + edad);
}


}


