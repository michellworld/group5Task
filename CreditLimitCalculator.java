

public  class CreditLimitCalculator{
    private int accountNumber;
    private int beginBal;
    private int totalItemCharges;
    private int totalCredit;
    private int  creditLimit;
    private int  newBalance;
    public CreditLimitCalculator(int accountNumber, int beginBal, int totalItemCharges, int totalCredit, int creditLimit){
        this.accountNumber = accountNumber;
        this.beginBal = beginBal;
        this.totalItemCharges=totalItemCharges;
        this.totalCredit =  totalCredit;
        this.creditLimit = creditLimit;
       
        

    }
    
    public int calculateBalance(){
       
        if (newBalance < creditLimit){
            newBalance = beginBal;
         System.out.println(" Credit limit exceeded");
        
        
        }
        if (newBalance > creditLimit) { 
            newBalance = beginBal  + totalCredit - creditLimit;
        }
        return newBalance;
    }
}