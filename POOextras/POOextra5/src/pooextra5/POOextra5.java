/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra5;

import pooextra5.utilidades.Empleado;

/**
 *
 * @author Usuario
 */
public class POOextra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e=new Empleado();
        System.out.println("el salario con aumento va a ser de $$"+e.calcular_aumento());
    }
    
}
