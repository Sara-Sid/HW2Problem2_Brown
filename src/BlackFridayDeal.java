import java.util.ArrayList;
import java.util.List;

public class BlackFridayDeal {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public void notifyCustomers(String deal, Customer... testList) {

        for (Customer c: testList) {
            if (customers.contains(c)) {
                c.receiveNotifications(deal);
            } else {
                System.out.println("Customer " + c.getName() + " is not subscribed to deal notifications.");
            }
        }
    }
}
