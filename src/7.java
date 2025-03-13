
import java.util.Random;

class MyProject {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10);
        System.out.println("Your random number is: " + randomNumber);
    }
}