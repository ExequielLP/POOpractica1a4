/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra4.DATOS;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cuenta {
    private double saldo;
    private String titular;

    public Cuenta( ) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese nombre de titular");
        this.titular = leer.nextLine();
        System.out.println("ingrese dinero a depositar en su cuenta buen hombre?");
        this.saldo = leer.nextDouble();
        
        
    }
public void retirar_dinero (double saldo){
   
    if (saldo<this.saldo) {this.saldo-=saldo;  
        
    }else System.out.println("no puede queda la cuenta en 0 capo");
    System.out.println("tu saldo es de "+this.saldo);

}    

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
