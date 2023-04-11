/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejer4;

import java.util.Scanner;
import pooejer4.DATA.Rectangulo;

/**
 *
 * @author Usuario
 */
public class POOejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese la base, seguido de la altura por favor");
        Rectangulo r=new Rectangulo(leer.nextInt(), leer.nextInt());
        System.out.println("superficie: "+r.superficie());
        System.out.println("periemtro : "+r.perimetro(0,0));
        r.Rectangulo(0, 0);
   
    }
    
}
