public class MyFirstGame {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 100);

        int playerNumber = 50;
        System.out.println("Ваше число " + mainNumber);

        int min = 0, max = 100;

        do {
            if (mainNumber > number) {
                max = playerNumber;

                System.out.println("Введенное вами число больше");
                playerNumber = (playerNumber - min) / 2;
            } else if (playerNumber < number) {
                min = playerNumber;

                System.out.println("Введенное вами число меньше");
                playerNumber += (max - playerNumber) /  2;
            }

            System.out.println("Ваше число " + playerNumber);
        } while ( playerNumber != randomNum);
        System.out.println("Вы угадали (" + randomNum + ") !");
    }
}
