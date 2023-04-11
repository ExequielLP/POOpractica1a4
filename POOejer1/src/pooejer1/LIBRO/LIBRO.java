/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejer1.LIBRO;

/**
 *
 * @author Usuario
 */
public class LIBRO {
     public int ISBN;
        public String Titulo;
        public String Auto;
        public String Autor;
        public int numeroPaginas;

    public LIBRO() {
    }

    public LIBRO(int ISBN, String Titulo, String Auto, String Autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Auto = Auto;
        
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "LIBRO{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Auto=" + Auto + ", Autor=" + Autor + ", numeroPaginas=" + numeroPaginas + '}';
    }

    
    
}
