import java.util.ArrayList;
public class Item{
    private String name;
    private Double price;
    private Integer index;

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
    public void setIndex(Integer index){
        this.index = index;
    }

    // GETTERS

    public String getName(){
        return this.name;
    }

    public Double getPrice(){
        return this.price;
    }

    public Integer getIndex(){
        return this.index;
    }
}


