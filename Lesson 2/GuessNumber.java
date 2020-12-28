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
        int randomNum = (int) (random.nextFloat() * 100);
        Player current = secondPlayer;
        int currentNumber = -1;
        do {
            current = current.equals(firstPlayer) ? secondPlayer : firstPlayer;
            System.out.println("\nPlayer " + current.getName() + ", please choise your number: ");
            currentNumber  = sc.nextInt();

            String result = currentNumber == randomNum ? ", You win!"
                : (currentNumber > randomNum ? ", your number is great" : ", your number is lowest");

            System.out.println("Player " + current.getName() + result);
        } while(currentNumber != randomNum);
    }
}
