/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejer1;

import java.util.Scanner;
import pooejer1.LIBRO.LIBRO;

/**Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 
 * Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.

 *
 * @author Usuario
 */
public class POOejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("por favor ingrese los siguientes datos del libro en este orden: \n1 ISBN \n2 titulo \n3 autor \n4 Numero de paginas ");
      LIBRO lb=new LIBRO(leer.nextInt(), leer.nextLine(), leer.nextLine(), leer.nextLine(), leer.nextInt());
      
      System.out.println(lb);
        
    }

     
    
}
