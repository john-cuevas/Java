import java.util.ArrayList;
public class CoffeeKiosk{

    // MEMBER VARIABLES

    private ArrayList<Item> menu = new ArrayList<Item>();
    private ArrayList<Item> orders = new ArrayList<Order>();

    // CONSTRUCTOR

    public CoffeeKiosk(){

    }

    // METHODS

    public void addMenuItem(String name, double price){
        Item newItem = new Item(name, price);
        menu.add(newItem);
    }

}