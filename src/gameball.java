import ball.game.Instruccions;
import java.util.Scanner;
public class gameball {
    public static void main(String[] args) {
        Instruccions.jugador();
        System.out.print("Introdueix el moviment de la pilota (1-5): ");
        Scanner sc = new Scanner(System.in);
        int moviment = sc.nextInt();
        // fer una barra on el primer sigui la pilota
        // demanar al jugador quantes vegades vol moure la pilota (1-5)
        // afegir un semafor, el qual canviara de color cada vegada que es mogui la pilota
        // i resepecte el que indiqui el semafor podra avançar o retrocedir 1 o 2 posicions
        //  
    }
}
