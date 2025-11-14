import java.util.List;
import java.util.ArrayList;

public class Category extends ProductComponent{
    protected List<ProductComponent> component= new ArrayList<>();
    //Constructor
    public Category(String name) {
        super(name, 0);
    }
    public void add(ProductComponent component){
        this.component.add(component);
    }

    @Override
    public double getPrice() {
        return 0;
    }
    public void display() {
        System.out.println("Category: " + getName());
        for (ProductComponent component : component) {
            component.display();

        }

    }

}