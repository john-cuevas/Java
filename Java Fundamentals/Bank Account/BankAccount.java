import java.util.Random;

public class BankAccount{
    // Attributes
    private String accountNumber;
    private Double checkingBalance;
    private Double savingsBalance;

    // static variables
    private static int accounts = 0;
    private static Double totalBalance; 

    // CONSTRUCTOR
    public BankAccount(Double checkingBalance, Double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        accounts++;
    }

    public BankAccount(){
        this.accountNumber = accountNumber;
    }

    // SETTERS
    public void setCheckingBalance(Double checkingBalance){
        this.checkingBalance = checkingBalance;
    }
    public void setSavingsBalance(Double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    // GETTERS
    public Double getCheckingBalance(){
        return this.checkingBalance;
    }
    public Double getSavingsBalance(){
        return this.savingsBalance;
    }

    public Double getTotalBalance(){
        this.totalBalance = this.checkingBalance + this.savingsBalance;
        return totalBalance;
    }

    public static int getAccounts(){
        return accounts;
    }

    public String getRandomNumber(){
        Random rand = new Random();
        String numbers = "0123456789";
        String[] number = new String[10];
        for(int i = 0; i < 10; i++){
            // returns character at specified index of string
            // converts index int to string
            number[i] = String.valueOf(numbers.charAt(i));
        }
        return number[rand.nextInt(10)];
    }

    public String generateAccount(){
        accountNumber = "";
        for(int i = 0; i < 10; i++){
            accountNumber = accountNumber + getRandomNumber();
        }
        return accountNumber;
    }

    // METHODS
    public void displayStatus(){
        System.out.printf("Account Number: %s \n", this.generateAccount());
        System.out.printf("Checking Balance: $%.2f \n", this.getCheckingBalance());
        System.out.printf("Savings Balance: $%.2f \n", this.getSavingsBalance());
        System.out.printf("Total Balance: $%.2f \n", this.getTotalBalance());
        System.out.printf("Accounts: %s \n", this.getAccounts());
    }

    // DEPOSIT checking
    public void depositCheckings(Double deposit){
        this.setCheckingBalance(checkingBalance + deposit);
        totalBalance += checkingBalance;

    }
    // DEPOSIT savings
    public void depositSavings(Double deposit){
        this.setSavingsBalance(savingsBalance + deposit);
        totalBalance += savingsBalance;

    }

    // WITHDRAW checking
    public void withdrawCheckings(Double withdrawal){
        if(checkingBalance > withdrawal){
            this.setCheckingBalance(checkingBalance - withdrawal);
            totalBalance -= checkingBalance;
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }

    // WITHDRAW savings
    public void withdrawSavings(Double withdrawal){
        if(savingsBalance > withdrawal){
            this.setSavingsBalance(savingsBalance - withdrawal);
            totalBalance -= savingsBalance;
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }
}