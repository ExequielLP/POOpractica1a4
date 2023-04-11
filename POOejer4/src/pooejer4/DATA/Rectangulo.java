/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejer4.DATA;

/**
 *
 * @author Usuario
 */
public class Rectangulo {

    private int base;
    private int altura;

    public void crearRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int superficie() {
        int superficie;
        superficie = this.base * this.altura;
        return superficie;
    }

    public int perimetro(int base, int altura) {
        int perimetro;
        perimetro = (this.base + this.altura)*2;

        return perimetro;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public void Rectangulo(int base,int altura){
        
        
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                if (i==0 || i==this.altura-1 || j==0 || j==this.base-1) {System.out.print("* ");
                    
                }else System.out.print("  ");
                
            }
            System.out.println("");
        }
        
    }

}
