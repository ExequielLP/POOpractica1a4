/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejer3.datos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JUEGO {
    private int contJ1;

    public int getContJ1() {
        return contJ1;
    }

    public void iniciar_juego() {
        int vic;
        int num1, num2, inte = 0;
        Scanner leer = new Scanner(System.in);

        System.out.println("─JUGADOR 1, ingrese su numero a adivinar");
        do {
            num1 = leer.nextInt();
            if (num1 < 1 || num1 > 20) {
                System.out.println("entre 1 y 20 dije");

            }
        } while (num1 < 0 || num1 > 20);
        System.out.println("─JUGADOR 2!Adivina el numero del JUUGADOR 1 ║tenes 5 intentos║");
        for (int i = 0; i < 5; i++) {
            inte=inte+1;
            

            num2 = leer.nextInt();

            if (num2 == num1) {;
         this.contJ1=contJ1+1;
          
                System.out.println("─ENHORABUENA‼‼‼ , acertaste en el intento : "+inte+" ツ " );
                break;
            } else if (inte == 5) {
                System.out.println("║Lo siento, no tenes mas intentos ║ ");
                break;

            } else if (num2 < num1) {
                System.out.println("mas alto capo.");
            } else if (num2 > num1) {
                System.out.println("mas bajo capo.");
            }
        }
        

        
    }
    /*
     * public int resultadoJuego(int contJ1){
    int resultado=0;
        resultado=resultado+contJ1;
         
    
        return resultado;
    }

    public JUEGO() {
        
    }
    */
}
