public class GuessNumber {

    private int randomNum;

    public GuessNumber(int randomNum) {
        this.randomNum = randomNum;
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
