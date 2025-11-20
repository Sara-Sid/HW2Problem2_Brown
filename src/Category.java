import java.util.List;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Category extends ProductComponent {
    private List<ProductComponent> components = new ArrayList<>();

    public Category(String name) {
        super(name, 0);
    }

    public void add(ProductComponent component) {
        components.add(component);
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void display() {
        System.out.println("Category: " + getName());
        for (ProductComponent c : components) {
            c.display();
        }
    }
}
