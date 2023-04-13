/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra6;

import java.util.Scanner;
import pooextra6.utilidades.Rectangulo;

/**Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" que calcule y devuelva el área del rectángulo.
 * Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.
 *
 * @author Usuario
 */
public class POOextra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Rectangulo r=new Rectangulo();
        System.out.println("el ares del recttangulo es "+r.calcular_area());
        Rectangulo rectangulo1=new Rectangulo(4, 6);
        System.out.println("el area del objeto Rectangulo1 es "+rectangulo1.calcular_area());
        
        
    }
    
}
