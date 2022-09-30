package Practical;
import java.util.Scanner;
public class PracticalLab {
	
	//create class largestofnumber
	 class Largestoftwonumber {
		 //create main method
	 public static void main(String[] args)
		   {
		 //insert number
		      int numberOne, numberTwo, largest;
		      //create scanner objet
		      Scanner scan = new Scanner(System.in);
		      //print enter first number
		      System.out.print("Enter the First Number: ");
		      numberOne = scan.nextInt();
		      System.out.print("Enter the Second Number: ");
		      numberTwo = scan.nextInt();
		      //create if condition
		      if(numberOne>numberTwo)
		         largest = numberOne;
		      //create else condition
		      else
		         largest = numberTwo;
		      //print largest number
		      System.out.println("\nLargest = " +largest);
		   }
	 }
}
