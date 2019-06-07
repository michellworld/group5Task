package chapter4.exercise416;

import java.util.Scanner;

public class BinaryNumber {
	public void checkBinary() {
		Scanner ops = new Scanner(System.in);
		
		System.out.println("Enter Binary Number: ");
		int number = ops.nextInt();
		
		int result = 1;
		int lee = 0;
		
		int counter = 1;
		
		while(number > 0) { 
		
				result = number % 10;
				 lee = result * counter + lee;
				 counter += counter;
				 number = number / 10;
				 
		
		}
		 System.out.println("Decimal equivalent: " + lee);
			
		
	}
	
}
