package ball.game;

import java.util.Scanner;
import java.util.Random;

public class BallAdvancer {
    // mostrar la pilota en la seva posició actual
    public static void showTotalBall(int totalsteps){

        for (int i = 0; i < totalsteps; i++){
            System.out.print("=");
        }
        System.out.println();
        
        for (int i = 0; i < totalsteps-1; i++){
            System.out.print(" ");
        }
        System.out.println("o");

        for (int i = 0; i < totalsteps; i++){
            System.out.print("=");
        }
        System.out.println();
    }


    // demanar al jugador la distancia maxima que pot recorre la pilota
    public static int maxAvance (){
        Scanner as = new Scanner(System.in);
        System.out.println("Introdueix maxima distancia de la pilota (ex: 15):");
        int max = as.nextInt();
        return max;
    }
    // demanar al jugador quantes vegades vol moure la pilota
    public static int Avanzar (){
        Scanner as = new Scanner(System.in);
        System.out.print("Introdueix quantes posicions vols avançar (1,2,3,4 o 5): ");
        int avanzar = as.nextInt();
        while (true){
            if (avanzar < 1 || avanzar > 5){
                System.out.print("Error. Introdueix quantes posicions vols avançar (1,2,3,4 o 5): ");
                avanzar = as.nextInt();
            } else {
                break;
        }
        }
        return avanzar;
    }
    // crear un random el qual retorna un valor entre 1 a 3, llavors depenent del valor que retorni indicarà el color del semafor i si es verd avançara les caselles dites,
    // si avancara totes les calselles -1 i si es vermell no avançara cap casella.
    public static int semafor (){
        Random rnd = new Random();
        int randomNum = rnd.nextInt(0,11 ) ;
        if (randomNum >= 1 && randomNum <= 4){
            System.out.println("El semafor es VERD, pots avançar totes les posicions.");
            return 0;
        } else if (randomNum >= 5 && randomNum <=7){
            System.out.println("El semafor es AMBAR, només pots avançar les posicions menys 1.");
            return -1;
        } else {
            System.out.println("El semafor es VERMELL, no pots avançar cap posició.");
            return -2;
        }
    }
    // rondes que es poden jugar (5 -10)
    public static int rondes (){
        Scanner as = new Scanner(System.in);
        System.out.print("Introdueix quantes rondes vols jugar (5-10): ");
        int rondes = as.nextInt();
        while (true){
            if (rondes < 5 || rondes > 10){
                System.out.print("Error. Introdueix quantes rondes vols jugar (5-10): ");
                rondes = as.nextInt();
            } else {
                break;
            }
        }
        return rondes;
    }






        
}


