import java.util.ArrayList;
public class Order{
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items;

    // methods

    public void displayStatus(){
        System.out.println("Name: " + this.name);
        System.out.println("Total: " + this.total);
        System.out.println("Ready: " + this.ready);
        // System.out.println("Name: " + this.name);
    }
}