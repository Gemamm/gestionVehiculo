
package com.ceep.test;
import com.ceep.domain.vehiculo;


public class PruebaGestion 
{

    
    public static void main(String[] args) 
    {
        //System.out.println("Vehiculo 1: ");
        vehiculo v1  = new vehiculo ("2546-MNH", "Opel", "Corsa","Azul", 25.95, true);
        //v1.mostrar();
        System.out.println("Coche 1: "+v1);
        vehiculo v2  = new vehiculo ("2546-MNH", "Opel", "Corsa","Azul", 25.95, true);
        System.out.println("Coche 2: "+v2);
                
        }
        
    }
    

