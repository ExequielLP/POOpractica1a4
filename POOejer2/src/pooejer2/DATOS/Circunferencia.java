/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejer2.DATOS;

/**
 *
 * @author Usuario
 */
public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(double radio){
    this.radio=radio ;
    }
    
    public double area(double radio){
        double area;
         area = (radio*3.1415)*2;
    return area;
    }
    public double perimetro(double radio){
        double perimetro;
        perimetro=(2*3.1415*radio);
    return perimetro;
    }
}
