/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejer3;

import java.util.Scanner;
import pooejer3.DATOS.Operacion;

/**
 *
 * @author Usuario
 */
public class POOejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        Operacion o=new Operacion();
       o.crearOperacion(leer.nextInt(), leer.nextInt());
        System.out.println("num1 quedo en  "+o.getNum1()); 
        System.out.println("num2 quedo en  "+o.getNum2());
        System.out.println("la suma es de  "+ o.suma(0,0));
        System.out.println("la resta es de "+o.restar(0, 0));
        System.out.println("la multiplicacion es "+o.multiplicar(0, 0));
        System.out.println("la division es de "+o.dividir(0, 0));
        
        
    }
    
}
