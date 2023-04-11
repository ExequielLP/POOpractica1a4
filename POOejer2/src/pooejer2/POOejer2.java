/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejer2;

import java.util.Scanner;
import pooejer2.DATOS.Circunferencia;

/**
 *
 * @author Usuario
 */
public class POOejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("y mete el radio y vemos q onda");
        Circunferencia c = new Circunferencia(0);
        c.setRadio(leer.nextDouble());
        
       c.crearCircunferencia(leer.nextDouble());
       c.area(leer.nextDouble());
       c.perimetro(leer.nextDouble());
        System.out.println(c.getRadio());
    }
    
}
