import java.util.ArrayList;
import java.util.List;

public class BlackFridayDeal {
    protected List<Customer> customer = new ArrayList<>();

    // Adding a customer to receive notifications
    public void addCustomer(Customer customer){
        this.customer.add(customer);
        System.out.println(customer.getName() + " is now subscribed to Black Friday Deals");
    }
    // Removing a customer to receive notifications
    public void removeCustomer(Customer customer){
        this.customer.remove(customer);
        System.out.println(customer.getName() + " is now unsubscribed to Black Friday Deals");
    }
    public void removeCustomer(Customer customer){
        this.customer.remove(customer);
        System.out.println(customer.getName() + " is now unsubscribed to Black Friday Deals");
    }

    // Sending notifications to every customer in the list who is subscribed 
    public void notifyCustomers(String deal){
        for (Customer customer: this.customer){
            customer.receiveNotifications(deal);
            System.out.println("------GET IT WHILE IT LASTSSSS-----\n");
        }
    }

}
