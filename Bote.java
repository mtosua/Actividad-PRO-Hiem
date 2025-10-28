/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.actividad05_programacionmodular;

/**
 *
 * @author DAW1
 */
public class Bote {
private static double bote = 0.0; 
private static int amigos = 0; 

private static final int BOTE_PERSONA = 10;
   


public int getAmigos(){
        return this.amigos;
    }
    
    public double getBote(){
        return this.bote * this.amigos;
    }
    
    
     
    
    public double getBOTE_PERSONA(){
        return this.amigos / this.bote;
    }
    
 
    
       
}





    


