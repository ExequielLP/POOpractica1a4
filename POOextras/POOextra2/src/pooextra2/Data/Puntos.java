/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra2.Data;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Puntos {
    Scanner leer = new Scanner(System.in);
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Puntos() {
        
    }

    

    
    
    
    public void crearPunto(){
        System.out.println("ingresa coordenada x1");
        x1=leer.nextDouble();
        System.out.println("ingresa coordenada y1");        
        y1=leer.nextDouble();
        System.out.println("ingresa coordenada x2");
        x2=leer.nextDouble();
        System.out.println("ingresa coordenada y2");
        y2=leer.nextDouble();
    }
    
    public double Distnacia(){
        double distancia;
      distancia= Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        
    return distancia;
    }
}
