import java.util.Scanner;
public class SaleCommisionCalculator{
    Scanner input = new Scanner(System.in);
    public double calculateSaleCommission(){
        int constantCommission = 200;
        double percentageCommission = 0.09;
        int counter = 0;
        double itemSold;
        double grossEarning;
        double total = 0;
        int numberOfItemSold = 1;
        System.out.println("Enter Number of Item sold");
        numberOfItemSold = input.nextInt();
        while (counter <= numberOfItemSold) {
            System.out.println("Enter amount of item sold");
            itemSold = input.nextInt();
            if (itemSold == -1){
                break;
             
            }
              total = total + itemSold;

            counter++;
        }
        double percentTotal = total * percentageCommission;
        grossEarning = constantCommission  + percentTotal;
        return grossEarning;


    }

    
}