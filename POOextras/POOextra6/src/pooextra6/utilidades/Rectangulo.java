/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra6.utilidades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Rectangulo {
    Scanner leer = new Scanner(System.in);
    private int lado1;
    private int lado2;

    public Rectangulo() {
        System.out.println("ingrese lado1 del rectangulo");
        this.lado1 =leer.nextInt();
        System.out.println("ingrese lado2 del rectangulo");
        this.lado2 =leer.nextInt();
    }

   
    
public int calcular_area(){
int area=lado1*lado2;
return area;
}    

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
}

