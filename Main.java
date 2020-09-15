import java.util.Scanner;

/**
 * a program to determine if a number is even or odd
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user import
    Scanner input = new Scanner(System.in);

    // declare a variable to see if a number is divisible by two
    final int DIVISIBLE_TWO = 2;

    // find out user number
    System.out.println("Please enter a number");
    int number = input.nextInt();

    // declare a variable for the divided number
    int number2 = number%DIVISIBLE_TWO;

    //figure out if number is divisible by two
    if (number/DIVISIBLE_TWO == number2){
      System.out.println("Your number is odd");
    } else {
      System.out.println ("Your number is even");
    }

  }
}
