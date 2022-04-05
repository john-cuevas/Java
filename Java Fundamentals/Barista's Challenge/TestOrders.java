import java.util.ArrayList;
public class TestOrders{
    public static void main(String[] args){
        
        // Menu items
        Item item1 = new Item("cappuccino", 5.50);
        Item item2 = new Item("latte", 4.50);
        Item item3 = new Item("mocha", 3.50);
        Item item4 = new Item("drip coffee", 2.50);

        // Create 2 orders for unspecified guests
        Order order1 = new Order();
        Order order2 = new Order();

        // Create 3 orders with names
        Order order3 = new Order("John");
        Order order4 = new Order("Heidi");
        Order order5 = new Order("Emily");

        // Add 2 items to order using addItem method
        order3.addItem(item1);
        order3.addItem(item2);

        // Implement getStatusMessage
        // System.out.println(order3.getStatusMessage());

        // Test getStatusMessage setting some orders to ready
        order1.setReady(true);
        order2.setReady(true);

        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());

        // Test the total by printing the return value
        System.out.println(order2.getOrderTotal());
    

        // Implement display method with order class

        // order1.displayStatus();
        // order2.displayStatus();
        order3.displayStatus();
        // order4.displayStatus();
        // order5.displayStatus();
    }
}