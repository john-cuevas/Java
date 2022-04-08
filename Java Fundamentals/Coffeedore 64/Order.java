import java.util.ArrayList;
public class Order{

    // MEMBER VARIABLES

    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    // CONSTRUCTOR
    public Order(){
        this.name = "Guest";
        this.ready = false;
    }

    public Order(String name){
        this.name = name;
        this.ready = false;
    }

    // GETTERS & SETTERS

    // SETTERS

    public void setName(String name){
        this.name = name;
    }

    public void setReady(Boolean ready){
        this.ready = ready;
    }

    public void setItems(ArrayList<Item> items){
        this.items = items;
    }

    // GETTERS

    public String getName(){
        return this.name;
    }

    public Boolean getReady(){
        return this.ready;
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }

    // METHODS

    public void displayStatus(){
        System.out.println("Customer Name: " + this.name);
        for (Item item : this.items){
            // System.out.println(item.getName() + " - $" + item.getPrice());
            System.out.printf("%s - $%.2f \n", item.getName(), item.getPrice());
        }
        // System.out.println("Total: $" + this.getOrderTotal());
        System.out.printf("Total: $%.2f \n", this.getOrderTotal());


    }

    // Add Item
    public void addItem (Item item){
        if(this.items == null){
            this.items = new ArrayList<Item>();
        }
        this.items.add(item);
    }

    // Get status
    public String getStatusMessage (){
        if(this.ready == true){
            return "Your order is ready.";
        }
        else{
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    // Get order total
    public Double getOrderTotal (){
        double total = 0.00;
        for (Item item : this.items){
            total += item.getPrice();
        }
        return total;
    }
}
