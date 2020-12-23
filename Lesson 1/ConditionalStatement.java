import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {

        System.out.println("Please enter age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 20) {
            System.out.println("Age is greater than 20!");
        }

        System.out.println("He's a man?");
        boolean sex = sc.nextBoolean();

        if (sex) {
            System.out.println("It's a Man!");
        }

        if (!sex) {
            System.out.println("It's not a Man!");
        }

        System.out.println("Enter the height");
        float height = sc.nextFloat();

        if (height < 1.80f) {
            System.out.println("It's a dwarf!");
        }
        else {
            System.out.println("It's a normal");
        }

        System.out.println("Enter the first letter of name:");
        char firstLetter = sc.next().charAt(0);

        if (firstLetter == 'M') {
            System.out.println("first letter is M");
        }
        else if (firstLetter == 'I') {
            System.out.println("first letter is I");
        }
        else {
            System.out.println("first letter is " + firstLetter);
        }

/*
        System.out.println("Enter the name:");
        String name = sc.next();

        switch (name.charAt(0)) {
            case 'M':
                System.out.println("first letter is M");
                break;
            case 'I':
                System.out.println("first letter is I");
                break;
            default:
                System.out.println("first letter is " + name.charAt(0));
                break;
        }
*/
    }
}
