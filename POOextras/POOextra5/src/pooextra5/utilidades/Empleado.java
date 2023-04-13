/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra5.utilidades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        this.nombre = leer.nextLine();
        System.out.println("ingrese su edad");
        this.edad = leer.nextInt();
        System.out.println("ingrese su salario actual por favor");
        this.salario = leer.nextDouble();
    }

    public double calcular_aumento() {
        if (edad > 30) {
            salario =salario+ salario * 0.10;
        } else if (edad < 30) {
            salario = salario+salario * 0.05;
        }
        return salario;
    }
}
