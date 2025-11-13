import java.util.ArrayList;
import java.util.List;

public class BlackFridayDeal {
    protected List<Customer> customer = new ArrayList<>();

    // Adding a customer to receive notifications
    public void addCustomer(Customer customer){
        this.customer.add(customer);
        System.out.print(customer.getName() + " is now subscribed to Black Friday Deals");
    }

    /* Sending notifications to every customer in the list who is subscribed */
    public void notifyCustomers(String deal){
        System.out.println("Did someone say NEW DEAL!!" );
        System.out.println("Announcing HEW BLACK FRIDAY DEALS");
        for (Customer customer : customer){
            customer.receiveNotifications(deal);
        }
    }

}
