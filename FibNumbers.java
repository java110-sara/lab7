//name: Sara Russert
//date: 1/20/24
//file: FibNumbers.java

//import statement for Scanner class
import java.util.Scanner;

public class FibNumbers {
   public static void main(String[] args) {
   
      // Declare and initialize variables for fib1, fib2, fib3, numFibs, and userInput
      int fib1 = 0, fib2 = 1, fib3 = fib1 +fib2, numFibs = 3, userInput = 0;
       
      // Declare and initialize boolean flag variable to control the input validation loop
      boolean isValid;
      
      // Declare and initialize boolean flag variable to control the while loop to generate the fibs
      boolean shouldLoop;
      
      // sets up keyboard for input
      Scanner keyboard = new Scanner(System.in);
      
      // gets user input
      System.out.print("How many numbers of the Fibonacci Sequence, >= 3, would you like to see?  ");
      userInput = keyboard.nextInt();
      isValid = userInput >= 3;
      
      // Implement input validation while loop
      while (!isValid) {
         System.out.print("Please enter a valid number. How many numbers of the Fibonacci Sequence, >= 3, would you like to see?  ");
         userInput = keyboard.nextInt();
         isValid = userInput >= 3;
      }
      
      // set the flag to userInput != numFibs;
      shouldLoop = userInput != numFibs;
      
      // print the initial starting messages
      System.out.println("Fibonacci numbers generated: ");
      System.out.print(fib1 + ", " + fib2 + ", " + fib3);
      
      // run the while loop adding the fib nums and reassigning the values
      while (shouldLoop) {
         fib1 = fib2;
         fib2 = fib3;
         fib3 = fib1 + fib2;
         
         // increment numFibs
         numFibs++;
         
         // print new number
         System.out.print(", " + fib3);
         
         // update flag
         shouldLoop = userInput != numFibs;
      }
      
      // print closing message
      System.out.println();
      System.out.println("The list is now complete with " + numFibs + " numbers.");

      System.exit(0);
   }
}