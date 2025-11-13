public class Customer {
    String name;

    public Customer(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void receiveNotifications(String deal){
        System.out.println(name + "DID SOMEONE SAY DEAL!!!");
        System.out.println(deal);
        System.out.println("Get it now before it is GONE!!");

    }
}
