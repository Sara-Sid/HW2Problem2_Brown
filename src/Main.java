public class Main{
    public static void main(String [] args){

        Category BlackFridayDeals = new Category("BLACK FRIDAY DEALSS");
        Category electronicCategory = new Category("Electronics ");




        Product laptop = new Product("Mac 2026" , 2300);
        Product smartphone = new Product("Iphone 17", 1200);
        Product desktop = new Product("Samsung Dell 22", 5100);
        Product tablet = new Product("Samsuuu 12", 920);
        Product tv = new Product("70-inch 5k TV", 700);


       electronicCategory.add(laptop);
       electronicCategory.add(smartphone);
       electronicCategory.add(desktop);
       electronicCategory.add(tablet);


       BlackFridayDeals.add(electronicCategory);
       BlackFridayDeals.add(tv);


        System.out.print("Category");
        BlackFridayDeals.display();


       BlackFridayDeal dealNotifier = new BlackFridayDeal();
       String dealMessage = "HUGE SAVINGS! BLACK FRIDAY DEALssss";
       dealNotifier.notifyCustomers(dealMessage);

       Customer customerA= new Customer("Sara");
       Customer customerB = new Customer("Jaheel");


        dealNotifier.addCustomer(customerA);
        dealNotifier.addCustomer(customerB);





    }
}




