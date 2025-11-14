public abstract class ProductComponent {
    protected String name;
    protected double price;

    public ProductComponent(String name, double price){
        this.name=name;
        this.price=price;
    }

    public String getName(){
        return name;
    }
    public abstract double getPrice();
    public abstract void display();

}
