import java.util.ArrayList;
import java.util.List;

public class BlackFridayDeal {
    protected List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public void notifyCustomers(String deal, List<Customer> allCustomers) {
        for (Customer c : allCustomers) {

            if (customers.contains(c)) {
                c.receiveNotification(deal);
            } 
            else {
                System.out.println("Customer " + c.getName() + " is not subscribed to deal notifications.\n");
            }
        }
    }
}
