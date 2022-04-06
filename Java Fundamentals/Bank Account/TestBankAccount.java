public class TestBankAccount{
    public static void main(String[] args){
        BankAccount account1 = new BankAccount(10.0, 1000.0);
        account1.displayStatus();
        System.out.println("Deposit Here");
        account1.depositCheckings(400.00);
        account1.depositSavings(700.00);
        account1.displayStatus();
        System.out.println("Withdraw Here");
        account1.withdrawCheckings(500.00);
        account1.displayStatus();
        System.out.println("Withdraw Here");
        account1.withdrawSavings(30000.00);
        account1.displayStatus();
    }
}