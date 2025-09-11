import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    int numberToGuess = rand.nextInt(bound: 100) + 1;
    int guess = 0;
    int attempts = 0;
    System.out.println("Welcome to the Number Guessing Game");
    System.out.println("Guess a number between 1 and 100:");
    while(guess != numberToGuess){
      System.out.print("Enter your guess: ");
      guess = sc.nextInt();
      attempts++;
      if(guess < numberToGuess){
        System.out.println("Too low Try again.");
      } else if (guess > numberToGuess){
        System.out.println("Too high Try again.");
      } else {
        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
      }
    }
    scan.close();
  }
}
