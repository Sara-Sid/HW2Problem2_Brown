public class Product extends ProductComponent{
    public Product(String name, double price) {
        super(name, price);
    }
    public double getPrice(){
        return this.price;
    }

    public void display(){
        System.out.println("Product: " + getName() + "Price: $ " + getPrice());
        }

}



