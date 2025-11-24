import ball.game.BallAdvancer;
import java.util.Scanner;
import java.util.Random;
public class gameball {
    public static void main(String[] args) {
        int maxDistance = BallAdvancer.maxAvance();
        int position = 0;
        Scanner scanner = new Scanner(System.in);
        int totalsteps = maxDistance -2;
        int rounds = BallAdvancer.rondes();
        for (int round = 1; round <= rounds; round++) {
            System.out.println("Ronda " + round + " de " + rounds);
            int movePositions = BallAdvancer.Avanzar();
            int semaforResult = BallAdvancer.semafor();
            // show ball position
            int totalstepsCurrent = Math.min(position + movePositions, maxDistance);
            BallAdvancer.showTotalBall(totalstepsCurrent);
            System.out.println();

            if (semaforResult == 0) {
                position += movePositions;
            } else if (semaforResult == -1) {
                position += Math.max(0, movePositions - 1);
            } else {
                System.out.println("No pots avançar aquesta ronda.");
            }

            if (position >= maxDistance) {
                System.out.println("Has arribat a la distància màxima! Has guanyat!");
                break;
            } else {
                System.out.println("Posició actual: " + position + " de " + maxDistance);
            }
        }
        if (position < maxDistance) {
            System.out.println("No has arribat a la distància màxima. Has perdut.");
        } else {
            System.out.println("Partida acabada.");
        }
    }
}
