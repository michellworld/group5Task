package chapter4.exercise416;
import java.util.Scanner;
public class Square {
		public static void main(String[] args) {
			
			
			Scanner input = new Scanner(System.in);
			
			
			System.out.println("Enter Square Size between 1 - 20: ");
			int squareSize= input.nextInt();
			
			if (squareSize <= 1 || squareSize >= 20) {
				System.out.println("Error !!! please enter valid size");
				
				}
			
			else {
				
				int row = 1;
				
				
				while(row >= 1) {
					int top = 1;
					int a = squareSize;
					while (top <= a) {
					System.out.print( " *" );
					++top;
				}
					System.out.println();
					
					int squareSide = 0;
					int b = squareSize * 2;
					
					while(squareSide <= squareSize) {
						int c = squareSize;
						
					   while(c <= b) {
						   System.out.print(c % squareSize == 0 ? "*" : "  ");
						   c++;
					   }
					   squareSide++;
					   System.out.println();
					}
					int bottom = 1;
					while (bottom <= a) {
						System.out.print("* ");
						++bottom;
					}
					--row;		
				System.out.println();
				}
			}
		}
}