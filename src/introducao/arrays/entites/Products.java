package introducao.arrays.entites;

public class Products {
    private String name;
    private double price;

    public Products(String name, double price){
        this.name = name;
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
