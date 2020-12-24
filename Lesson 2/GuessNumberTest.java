import java.util.*;

public class GuessNumberTest {

    public static void main(String[] args) {
        List<Player> players = new ArrayList<Player>();

        Scanner sc = new Scanner(System.in);

        System.out.println("First gamer: ");
        String name = sc.nextLine();
        players.add(new Player(name));

        System.out.println("Second gamer: ");
        name = sc.nextLine();
        players.add(new Player(name));

        Random random = new Random();
        GuessNumber gn = new GuessNumber((int) (random.nextFloat() * 100));

        boolean notFoundIt = true;
        while(notFoundIt) {
            for(Player player: players) {
                System.out.println("\n" + player.getName() + ", enter number: ");
                int playerNumber = sc.nextInt();

                if(gn.testNumber(playerNumber) == true) {
                    System.out.println("\n" + player.getName() + "! You win!!!");
                    notFoundIt = false;
                    break;
                } else if (prompt(sc) == false) {
                    notFoundIt = false;
                    break;
                }
            }
        }
    }

    public static boolean prompt(Scanner sc) {
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
