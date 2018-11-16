package Dominio;

import java.io.Serializable;

public class Perro implements Serializable{
    
    //Variables de instancia
    private String nombre;
    private String raza;
    private int altura;
    private int edad;

    
    public Perro() {
        this.setNombre("");
        this.setRaza("");
        this.setEdad(0);
        this.setAltura(0);
    }
    
    public Perro(String unNombre, String unaRaza, int unaAltura, int unaEdad) {
        this.setNombre(unNombre);
        this.setRaza(unaRaza);
        this.setEdad(unaEdad);
        this.setAltura(unaAltura);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    //Metodo de Impresion
    @Override
    public String toString() {
        return "Nombre mascota: " + this.getNombre()
                + " Raza: " + this.getRaza()
                + " Edad: " + this.getEdad()
                + " Altura " + this.getAltura();
    }
    
    
    
    
}
