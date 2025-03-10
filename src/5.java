import java.util.Random;

public class RandomNumber {
  public static void main(String[] args) {
    Random rand = new Random();
    int number = rand.nextInt((10 - 1) + 1) + 1;
    System.out.println("Your random number is: " + number);
  }
}