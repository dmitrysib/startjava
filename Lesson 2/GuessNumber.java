import java.util.Scanner;

public class GuessNumber {

    private Player firstPlayer;
    private Player secondPlayer;
    private int randomNum;
    private Scanner sc;

    GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    void startGame(int randomNum, Scanner sc) {
        this.randomNum = randomNum;
        this.sc = sc;

        while(true) {
            pickNumber(firstPlayer);
            if(testNumber(firstPlayer.getNumber())) {
                System.out.println("Player " + firstPlayer.getName() + ", You win!");
                return;
            }

            pickNumber(secondPlayer);
            if(testNumber(secondPlayer.getNumber())) {
                System.out.println("Player " + secondPlayer.getName() + ", You win!");
                return;
            }
        }
    }

    void pickNumber(Player player) {
        System.out.println("Player " + player.getName() + ", please choise your number: ");
        player.setNumber(sc.nextInt());
    }

    public boolean testNumber(int playerNumber) {
        if(playerNumber == this.randomNum) {
            return true;
        } else if(playerNumber > this.randomNum) {
            System.out.println("Your number is great");
        } else {
            System.out.println("Your number is lowest");
        }
        return false;
    }
}
