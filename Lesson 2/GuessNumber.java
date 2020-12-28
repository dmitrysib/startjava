import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player firstPlayer;
    private Player secondPlayer;

    GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    void start() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;
        Player current = secondPlayer;
        int currentNumber = -1;
        do {
            current = current.equals(firstPlayer) ? secondPlayer : firstPlayer;
            System.out.println("\nPlayer " + current.getName() + ", please choise your number: ");
            currentNumber  = sc.nextInt();

            if(currentNumber == randomNum) {
                System.out.println("Player " + current.getName() + ", your number is win");
                break;
            }

            String message = currentNumber > randomNum ? "great" : "less";
            System.out.println("Player " + current.getName() + ", your number is " + message);
        } while(true);
    }
}
