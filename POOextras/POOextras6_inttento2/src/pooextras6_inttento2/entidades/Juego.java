/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextras6_inttento2.entidades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Juego {
    private int num1;
    private int num2;
    private int jugador1;
    private int jugador2;
    private int intentos;
    Scanner leer = new Scanner(System.in);
    public void iniciar_juego(){
        System.out.println("Jugador 1 ingrese su numero del 1 al 20 para ser adivinador");
       do{
        num1=leer.nextInt();
           if (num1<0 || num1>20) {System.out.println(" del 1 al 20 capo ....");
               
           }
       }while(num1<0 || num1>21);
       System.out.println("Jugador 2 adivine el numero de jugador 1");
       while(intentos!=5){
        num2=leer.nextInt();
       intentos+=1;
           if (num2!=num1) {System.out.println(" casi pero no, intentalo de vuelta");
               
           }else if (num2==num1) { jugador1+=1 ;System.out.println(" faa amigo sos re capo! ");break;
               
           }else if (num2<num1) {System.out.println("mas alto amigo");
               
           }else if (num2>num1) {System.out.println(" mas abajo amigo");
               
           }
       }
        
        
    
    
    }
    
}
