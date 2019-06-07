package chapter4.exercise416;

import java.util.Scanner;

public class Palindrome {
			
		
		
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
			
			System.out.println("Enter Number: ");
			int	number = input.nextInt();
				
			int initialNumber = number;
			int reversed = 0;
			int remainder = 0;
			
//			if (number < 10000) {
//				System.out.println("Error!!! kindly enter number below 10,000");
//			}
			
			
				while(number > 0)
				{	
					remainder = number % 10;
					reversed = reversed * 10 + remainder;
					
					number = number/10;
				}
				
				
				if (reversed == initialNumber) {
					
					System.out.println("this is a Palindrome");
				}
				else {
					System.out.println("this is not a Palindrome");
				}
			
			}
			
		}

