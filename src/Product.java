public class Product extends ProductComponent{
    public Product(String name, int price) {
        super(name, price);
    }
    public int getPrice(){
        return this.price;
    }

    public void display(){
        System.out.println("Product: " + getName() + "Price: $ " + getPrice());
        }

}



