package ball.game;

import java.util.Scanner;

public class Instruccions {
    public static String jugador(){
        char ball = '*';
        char distancia = '_';
        for (int j = 0; j < 1; j++) {
            System.out.print(ball);
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(distancia);
        }
        int moviment;
        Scanner sc = new Scanner(System.in);
        moviment = sc.nextInt();
        if (moviment ==1){
            ball += 1;
            distancia -= 1;
        } else if (moviment ==2){
            ball += 2;
            distancia -= 2;
        } else if (moviment ==3){
            ball += 3;
            distancia -= 3;
        } else if (moviment ==4){
            ball += 4;
            distancia -= 4;
        } else if (moviment ==5){
            ball += 5;
            distancia -= 5;
        }
        System.out.print(ball);
        System.out.print(distancia);
        
        return "";

    }
}

