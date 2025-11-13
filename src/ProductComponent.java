public abstract class ProductComponent {
    protected String name;
    protected int price;

    public ProductComponent(String name, int price){
        this.name=name;
        this.price=price;
    }

    public String getName(){
        return name;
    }
    public abstract int getPrice();
    public abstract void display();

}
