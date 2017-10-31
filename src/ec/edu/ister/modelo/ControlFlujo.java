/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class ControlFlujo {
    public static void ifAnidado() {
        
        int a=7;
        
        if (a>3) {
            System.out.println("Es mayor");
        }
        else if (a<3){
            System.out.println("Es menor");
        }
        else {
            System.out.println("Es igual");
        }
        
    }
    public static void ingresandoSwitch() {
        
        int u=1;
        
        switch (u){
            case 1:
                System.out.println("La nota es: A");
                break;
                
            case 2:
                System.out.println("La nota es: B");
                break;
                
            default:
                System.out.println("Nota invalida");
            
        }
        
    }
    
     public static void ingresandoTecladoSwitch() {
        
        int u=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese una nota"));
        
        switch (u){
            case 10:
                System.out.println("La nota es A");
                break;
                
            case 8:
                System.out.println("La nota es B");
                break;
                
            default:
                System.out.println("Nota invalida");
            
        }
        
    }
    
}
