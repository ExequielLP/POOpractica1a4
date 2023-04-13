/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerextra1.Cancion;

/**
 *
 * @author Usuario
 */
public class Cancion {
    private String Tilulo;
    private String Autor;

    public Cancion(String Tilulo, String Autor) {
        this.Tilulo = Tilulo;
        this.Autor = Autor;
    }

    public Cancion() {
       
    }

    public String getTilulo() {
        return Tilulo;
    }

    public String getAutor() {
        return Autor;
    }
    
}
