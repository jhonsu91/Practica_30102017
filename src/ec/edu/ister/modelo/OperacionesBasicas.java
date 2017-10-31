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
public class OperacionesBasicas {
    public static void sumaDosNumeros () {
        
        int x=7;
        int y=3;
        
        JOptionPane.showMessageDialog(null, x+y);    
    }
    public static void sumaConParametros(int x,int y) {
        int z=x+y;
        JOptionPane.showMessageDialog(null,"La suma es:"+z);
        
    }
    public static int sumaDevuelve(int x,int y) {
        JOptionPane.showMessageDialog(null,"La suma es:"+(x+y));
        return x+y;
    }
    
}
