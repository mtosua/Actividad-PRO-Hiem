/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.actividad05_programacionmodular;
import javax.swing.JOptionPane;
/**
 *
 * @author DAW1
 */
public class Actividad05_ProgramacionModular {

    
   private static Amigos amigos;
 public static void main(String[] args) {
     int amigos = 0;
    
     
    do {
        
       String resp = JOptionPane.showInputDialog(
       """
                    Gestión del bote
                   ====================
                   
                   1. Añadir Amigos
                   2. Nueva Aportación
                   3. Pagar Ronda
                   4. Quitar Amigos
                   
                   5. Salir
                   
                   Opción [1-5]
       
       """);
        amigos = Integer.parseInt(resp);
    switch (amigos) {
                case 1:
                   
                    añadirAmigos();
                   
                    break;
            }
        } while (amigos != 5);
    }

    private static void añadirAmigos() {
       do {
            String resp = JOptionPane.showInputDialog("Añadir");
           
        } while (JOptionPane.showConfirmDialog(
            null,
            "Desea añadir otro amigo",
            "Nuevo Amigo",
            JOptionPane.YES_NO_OPTION)
         ==
         JOptionPane.YES_OPTION);
    }
}

        
            

    
   

   
    
    

