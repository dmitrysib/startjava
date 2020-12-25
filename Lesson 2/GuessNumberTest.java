import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of first player: ");
        Player firstPlayer = new Player(sc.nextLine());

        System.out.println("Enter name of second player: ");
        Player secondPlayer = new Player(sc.nextLine());

        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);

        do {
            game.start();

            String answer = "";
            while(!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Continue game? [yes/no]:");
                answer = sc.nextLine();
            }
            if (answer.equals("no")) {
                sc.close();
                return;
            }
        } while(true);
    }
}
