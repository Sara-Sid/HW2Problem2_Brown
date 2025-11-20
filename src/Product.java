public class Product extends ProductComponent {
    public Product(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void display() {
        System.out.println("Product: " + getName() + ", Price: $" + getPrice());
    }
}



