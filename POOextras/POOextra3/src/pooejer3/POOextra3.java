/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejer3;

import java.util.Scanner;
import pooejer3.datos.JUEGO;

/**
 *
 * @author Usuario
 */
public class POOextra3 {

    /**
     * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a
     * dos jugadores jugar un juego de adivinanza de números. El primer jugador
     * elige un número y el segundo jugador intenta adivinarlo. El segundo
     * jugador tiene un número limitado de intentos y recibe una pista de "más
     * alto" o "más bajo" después de cada intento. El juego termina cuando el
     * segundo jugador adivina el número o se queda sin intentos. Registra el
     * número de intentos necesarios para adivinar el número y el número de
     * veces que cada jugador ha ganado.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int  resultado=0,v=0;
      
        // TODO code application logic here
        System.out.println("ESTE JUEGO CONSTARA DE 4 RONDAS, EL JUGAR (JUGADOR 1 Y JUGADOR 2) EL QUE MAS RONDAS GANE, SERA EL VENCEDOR");
        System.out.println("bienvenido al juego de adivinar el numero \rREGLAS☻: \n►REGLA1--- jugador 1 ingresa un numero x del 1 al 20. \n►REGLA2--- jugador 2 intenta adivinarlo, tiene 5 intentos. \n►REGLA3--- se le brindara una ayuda si al jugardor 2 al ingresar un numero, mayor o menor.");
       
        System.out.println("ROUND 1 JUGADOR 1");
        System.out.println("↓");
        JUEGO j1=new JUEGO();
        for (int i = 0; i < 2; i++) {
            j1.iniciar_juego();System.out.println("SIGUIENTE ROUND ");}
        System.out.println("tus victorias son  ");
        System.out.println(j1.getContJ1());
        
        JUEGO j2=new JUEGO();
        System.out.println("↔ ↔ INVIERTAN ROLES ↔ ↔");
        System.out.println("ROUND 1 JUGODOR 2");
        System.out.println("↓");
        for (int i = 0; i < 2; i++) {
            j2.iniciar_juego();
            System.out.println("SIGUENTE ROUND");
        }
         System.out.println("tus victorias son  ");
        System.out.println(j2.getContJ1());
        System.out.println("▬▬▬▬FIN DEL JUEGOOOOOO ▬▬▬▬");
        if (j1.getContJ1()<j2.getContJ1()) {System.out.println("GANO EL JUGADOR 2!");
            
        }else if (j1.getContJ1()>j2.getContJ1()) {System.out.println("GANO EL JUGADOR 1");
            
        }else   System.out.println("EMPATARON JAJA");
    }
 
}
