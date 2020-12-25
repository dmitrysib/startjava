import java.util.*;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of first player: ");
        Player firstPlayer = new Player(sc.nextLine());

        System.out.println("Enter name of second player: ");
        Player secondPlayer = new Player(sc.nextLine());

        GuessNumber gn = new GuessNumber(firstPlayer, secondPlayer);
        Random random = new Random();

        do {
            gn.startGame((int) (random.nextFloat() * 100), sc);

        } while(isNext(sc));

        sc.close();
    }

    public static boolean isNext(Scanner sc) {
        sc.nextLine();

        while(true) {
            System.out.println("Continue game? [yes/no]: ");
            String answer = sc.nextLine();

            if(answer.equals("yes")) {
                return true;
            } else if(answer.equals("no")) {
                return false;
            }
        }
    }
}
