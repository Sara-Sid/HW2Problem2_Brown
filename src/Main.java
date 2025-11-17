public class Main {
    public static void main(String[] args) {

        // Composite pattern
        Category electronicCategory = new Category("Electronics");
        electronicCategory.add(new Product("Laptops", 2300.00));
        electronicCategory.add(new Product("Desktop", 5100.00));
        electronicCategory.add(new Product("Tablets", 920.99));
        electronicCategory.add(new Product("TV", 700.99));


        Category clothingCategory = new Category("Clothing");
        clothingCategory.add(new Product("dresses", 12.99));
        clothingCategory.add(new Product("shoes", 25.00));
        clothingCategory.add( new Product("tops", 5.99));
        clothingCategory.add(new Product("jeans", 20.00));


        Category homeGoodsCategory = new Category("Home Goods");
        homeGoodsCategory.add( new Product("vacuums", 120.99));
        homeGoodsCategory.add(new Product("Smart Home devices", 299.99));
        homeGoodsCategory.add(new Product("Ninja", 199.99));

        Category otherItemCategory = new Category("Other Items");
        otherItemCategory.add(new Product("Smart Speakers", 69.99));
        otherItemCategory.add(new Product("Skin care", 10.00));


        Category BlackFridayDeal = new Category("Black Friday Deals");
        BlackFridayDeal.add(electronicCategory);
        BlackFridayDeal.add(clothingCategory);
        BlackFridayDeal.add(homeGoodsCategory);
        BlackFridayDeal.add(otherItemCategory);


        System.out.println("====================================================");
        BlackFridayDeal.display();
        System.out.println("====================================================");

        // Observer Pattern
        BlackFridayDeal dealNotifier = new BlackFridayDeal();
        Customer customerA = new Customer("Sara");
        Customer customerB = new Customer("Jaheel");
        Customer customerC = new Customer("Bella");
        Customer customerD = new Customer("Gavin");

        dealNotifier.addCustomer(customerA);
        dealNotifier.addCustomer(customerB);
        dealNotifier.removeCustomer(customerC);
        dealNotifier.addCustomer(customerD);

        System.out.println("Did someone say NEW DEAL!!");
        System.out.println("Announcing HEW BLACK FRIDAY DEALS");
        System.out.println("==================================\n");

        String dealMessage1 = "50% OFF STORE WIDE, SHOP WHILE IT LAST ";

        
        dealNotifier.notifyCustomers(dealMessage1);

    }
}





