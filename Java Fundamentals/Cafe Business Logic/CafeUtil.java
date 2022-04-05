import java.util.ArrayList;
import java.util.Arrays;
public class CafeUtil{
    public int getStreakGoal(){
        int sum;
        sum = 0;
        for(int i = 0; i <= 10; i++){
            sum +=i;
        }
        return sum;
        
    } 
    public double getOrderTotal(double[]lineItems){
        double total;
        
        total = 0;
        for (int i = 0; i < lineItems.length; i++){
            total += lineItems[i];
        } 
        return total;
    }
    public void displayMenu(ArrayList<String> menu){
        for (int i = 0; i < menu.size(); i++){
            System.out.println(i + menu.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s! \n", userName);
        System.out.printf("There are %d people in front of you \n", customers.size());
        customers.add(userName);
        System.out.println(customers);

    }
}