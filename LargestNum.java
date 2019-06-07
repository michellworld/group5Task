import java.util.Scanner;

public class LargestNum{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        int numCounter = 1;
        int number = 0;
        int sales;
        int largest = 0;


        while(numCounter <= 10){

          System.out.printf("Input number: ", numCounter);
          number = input.nextInt();
          if(number > largest){
              largest = number;
          }
          numCounter++;
            }

            System.out.printf("Largest number is %d\n", largest);
           
        }
    }
