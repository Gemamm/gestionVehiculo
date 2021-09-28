
package com.ceep.domain;



// Clase vehiculo

public class vehiculo {
    
    String matricula, marca, modelo, color;
    double tarifa;
    boolean disponible;

    public vehiculo() {
    }

    public vehiculo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void mostrar()
    {
        System.out.println("Matricula: "+matricula);
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Color: "+color);
        System.out.println("Tarifa: "+tarifa);
        System.out.println("Disponible: "+disponible);
        
    }

    @Override
    public String toString() {
        return "vehiculo:\n" + "matricula:" + matricula + "\nmarca:\t" + marca + "\nmodelo:\t" + modelo + "\ncolor:\t" + color + "\ntarifa:\t" + tarifa + "\ndisponible:\t" + disponible ;
    }
     
    
    }
    

