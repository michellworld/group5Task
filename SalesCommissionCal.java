//A program that calculates customers
//credit balance
import java.util.Scanner;

public class SalesCommissionCal{
     

    public static void main(String args[]){
     int value;
     int itemSold;
     int itemCounter;

     double percentageCommission = 0.09;
     double constantCommission = 200;
     int total = 0;
        Scanner input = new Scanner(System.in);

        itemSold = 1;
        value = 1;
        itemCounter = 1;

        System.out.print("Enter the number of item sold or -1 to quit: ");
        itemSold = input.nextInt();

        while(value != -1){
            total = total + value;
            itemCounter++;

            System.out.print("Enter Value or -1 to quit: ");
            value = input.nextInt();

        }

        
         double getPercentTotal = (double) total * percentageCommission + constantCommission;

         System.out.printf("%nTotal items sold lastweek are %d%n", itemCounter, total);
         System.out.printf("Total earnings are %.2f%n", getPercentTotal);
        }

    }

