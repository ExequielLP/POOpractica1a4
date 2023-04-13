/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerextra1;

import ejerextra1.Cancion.Cancion;

/**Desarrollar una clase Cancion con los siguientes atributos: título y autor.
 * Se deberá definir además dos constructores: uno vacío que inicializa el título y el autor a cadenas vacías y otro que reciba como parámetros el título y el autor de la canción.
 * Se deberán además definir los métodos getters y setters correspondientes.

 *
 * @author Usuario
 */
public class EJERextra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion c=new Cancion("ale", "cc");
        
        System.out.println(c.getAutor()); 
        System.out.println(c.getTilulo());
        
// TODO code application logic here
    } 
    
}
