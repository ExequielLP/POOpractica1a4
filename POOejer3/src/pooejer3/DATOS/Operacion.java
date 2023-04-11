/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejer3.DATOS;

/**
 *
 * @author Usuario
 */
public class Operacion {
    private int num1;
    private int num2;

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void crearOperacion(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
        
    }
    public int suma(int num1,int num2){
        int suma;
        suma=this.num1+this.num2;
        return suma;
    }
    public int restar (int num1,int num2){
        int restar ;
        restar=this.num1-this.num2;
    return restar;
}
    public int multiplicar (int num1 , int num2){
        int multiplicar;
        if (this.num1==0 || this.num2==0){System.out.println("hay un error");
        multiplicar=0;
        }else multiplicar=this.num1*this.num2;
        
    return multiplicar;
}
    public double dividir(int num1 , int num2){
        double dividir;
        if (this.num1==0 || this.num2==0) {System.out.println("hay un error");
        dividir=0;
        }else dividir=this.num1/this.num2;
    return dividir;
    }
}