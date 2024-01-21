//name: Sara Russert
//date: 1/20/24
//file: EvenNumbers.java

// import needed libs
import javax.swing.JOptionPane;


public class EvenNumbers {
   public static void main(String[] args) {
   
//    Declare a constant for the smallest even number with which to initialize the list
      final int SMALLEST_EVEN_NUM = -10;
      
//    Declare and initialize variables for the currentEvenNum, maxEvenNum, and
//    counter (to keep track of how many nums are in the list)
      int currentEvenNum = SMALLEST_EVEN_NUM, maxEvenNum, counter = 0;
      
//    Declare and initialize boolean flag variable to control the loop
      boolean runLoop;
           
//    Collect user input for maxEvenNum
      maxEvenNum = Integer.parseInt(JOptionPane.showInputDialog("Enter a maximum even number:  "));
      
      while (maxEvenNum <= SMALLEST_EVEN_NUM) {
         maxEvenNum = Integer.parseInt(JOptionPane.showInputDialog("Your number must be greater than " + SMALLEST_EVEN_NUM +". Enter a maximum even number:  "));
      }
      
//    If the user input is odd, make it even by incrementing by one with the increment operator
      if (maxEvenNum % 2 != 0) {
         JOptionPane.showMessageDialog(null,"You entered " + maxEvenNum + ", an odd number. Your number is being incremented by one to: " + ++maxEvenNum + ".");
      }

//    Implement a while loop, condition-controlled by the boolean flag, to generate the list
//    Use println / print statements so that program output is similar to what is seen in program output slides

      System.out.println("Even numbers from " + SMALLEST_EVEN_NUM + " to " + maxEvenNum + "...");
      runLoop = currentEvenNum <= maxEvenNum;
      System.out.print(currentEvenNum + ", ");
      
      while (runLoop) {
         // increment counter, increment currentEvenNumber by 2, update flag value, print num
         counter++;
         currentEvenNum += 2;
         System.out.print(currentEvenNum);
         runLoop = currentEvenNum < maxEvenNum;
         if (runLoop) System.out.print(", ");
      }
      
      System.out.println();
      System.out.println("The list is now complete. It contains " + counter + " numbers.");
      
   
      System.exit(0); 
   }
}