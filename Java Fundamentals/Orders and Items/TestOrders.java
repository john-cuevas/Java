import java.util.ArrayList;
public class TestOrders{
    public static void main(String[] args){
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();

        // Instantiate items
        item1.name = "mocha";
        item1.price = 3.50;

        item2.name = "latte";
        item2.price = 2.50;

        item3.name = "drip coffee";
        item3.price = 4.50;

        item4.name = "cappuccino";
        item4.price = 5.50;

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        // Instantiate orders
        order1.name = "Cindhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";

        order1.ready = true;
        order2.ready = true;
        order3.ready = false;
        order4.ready = false;
        
        order1.items = new ArrayList<Item>();
        order2.items = new ArrayList<Item>();
        order3.items = new ArrayList<Item>();
        order4.items = new ArrayList<Item>();

        // Add item 1 to order 2
        order2.items.add(item1);
        order2.total += item1.price;

        // Add cappuccino to order 3
        order3.items.add(item4);
        order3.total += item4.price;

        // Order 4 adds latte
        order4.items.add(item2);
        order4.total += item2.price;

        // Sam ordered 2 more drinks - lattes
        order4.items.add(item2);
        order4.total += (item2.price *2);

        order1.displayStatus();
        order2.displayStatus();
        order3.displayStatus();
        order4.displayStatus();
    }
}