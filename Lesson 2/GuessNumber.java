import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player firstPlayer;
    private Player secondPlayer;
    private int randomNum;
    private Scanner sc;
    private Random random;

    GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;

        sc = new Scanner(System.in);
        random = new Random();
    }

    void start() {
        randomNum = (int) (random.nextFloat() * 100);
        Player current = secondPlayer;
        do {
            current = current.equals(firstPlayer)? secondPlayer : firstPlayer;
            inputNumber(current);

            // Чтобы каждый раз не дергать метод
            int playerNumber = current.getNumber();
            if(playerNumber > randomNum) {
                System.out.println("Player " + current.getName() + ", your number is great");
            } else if(playerNumber < randomNum) {
                System.out.println("Player " + current.getName() + ", your number is lowest");
            } else {
                break;
            }
        } while(true);
        System.out.println("Player " + current.getName() + ", You win!");
    }

    void inputNumber(Player player) {
        System.out.println("\nPlayer " + player.getName() + ", please choise your number: ");
        player.setNumber(sc.nextInt());
    }
}
