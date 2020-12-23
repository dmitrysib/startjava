public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println("'for' cycle, number is " + i);
        }

        int i = 6;
        while(i >= -6) {
            System.out.println("'while' cycle, number is " + i);
            i -= 2;
        }

        int sum = 0;
        i = 10;
        do {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        } while( i < 20);
        System.out.println("'do-while-sum' cycle, sum is " + sum);
    }
}
