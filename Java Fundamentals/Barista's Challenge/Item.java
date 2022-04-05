import java.util.ArrayList;
public class Item{
    public String name;
    public Double price;

    public Item(String name, Double price){
        this.name = name;
        this.price = price;
    }
    // GETTERS & SETTERS

    // SETTERS

    public void setName(String name){
        this.name = name;
    }

    public void setReady(Double price){
        this.price = price;
    }

    // GETTERS

    public String getName(){
        return this.name;
    }

    public Double getPrice(){
        return this.price;
    }
}


