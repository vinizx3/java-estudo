package poo.course.entities;

public class Product {
    public String name;
    public Double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity += quantity;
    }

    public String toString(){
        return name + ", $" + String.format("%.2f", price) + ", " + quantity + " unitis, Total: " + totalValueInStock();
    }
}
