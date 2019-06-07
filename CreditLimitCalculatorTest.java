public class CreditLimitCalculatorTest{
    public static void main(String[] args){
        CreditLimitCalculator customer = new CreditLimitCalculator(221321, 5000, 30000, 40000, 50000);
        System.out.println(customer.calculateBalance());
    }
    
}