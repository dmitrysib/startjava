public class MyFirstGame {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 100);

        int mainNumber = 50;
        System.out.println("Ваше число " + mainNumber);

        int min = 0, max = 100;

        do {
            if (mainNumber > number) {
                max = mainNumber;

                System.out.println("Введенное вами число больше");
                mainNumber = (mainNumber - min) / 2;
            }
            else if (mainNumber < number) {
                min = mainNumber;

                System.out.println("Введенное вами число меньше");
                mainNumber += (max - mainNumber) /  2;
            }

            System.out.println("Ваше число " + mainNumber);
        } while ( mainNumber != number);

        System.out.println("Вы угадали (" + number + ") !");
    }
}
