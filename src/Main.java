public class Main {
    public static void main(String[] args) {

        Product laptop = new Product("Laptops", 2300.00);
        Product desktop = new Product("Desktop", 5100.00);
        Product tablets = new Product("Tablets", 920.99);
        Product tv = new Product("TV", 700.99);
        System.out.println();

        Product dresses = new Product("dresses", 12.99);
        Product shoes = new Product("shoes", 25.00);
        Product tops = new Product("tops", 5.99);
        Product jeans = new Product("jeans", 20.00);
        System.out.println();

        Product vacuums = new Product("vacuums", 120.99);
        Product smartHome = new Product("Smart Home devices", 299.99);
        Product ninja = new Product("Ninja", 199.99);
        System.out.println();

        Product smartSpeakers = new Product("Smart Speakers", 69.99);
        Product skinCare = new Product("Skin care", 10.00);
        System.out.println();

        // 2. Create Composite Categories and add Products
        Category electronicCategory = new Category("Electronics");
        electronicCategory.add(laptop);
        electronicCategory.add(desktop);
        electronicCategory.add(tablets);
        electronicCategory.add(tv);

        Category clothingCategory = new Category("Clothing");
        clothingCategory.add(dresses);
        clothingCategory.add(shoes);
        clothingCategory.add(tops);
        clothingCategory.add(jeans);

        Category homeGoodsCategory = new Category("Home Goods");
        homeGoodsCategory.add(vacuums);
        homeGoodsCategory.add(smartHome);
        homeGoodsCategory.add(ninja);

        Category otherItemCategory = new Category("Other Items");
        otherItemCategory.add(smartSpeakers);
        otherItemCategory.add(skinCare);


        // 3. Create the Root Composite and add sub-categories
        Category BlackFridayDeal = new Category("Black Friday Deals");
        BlackFridayDeal.add(electronicCategory);
        BlackFridayDeal.add(clothingCategory);
        BlackFridayDeal.add(homeGoodsCategory);
        BlackFridayDeal.add(otherItemCategory);

        // 4. Display the entire structure from the root
        System.out.println("====================================================");
        BlackFridayDeal.display(); // Start display with no initial indent
        System.out.println("====================================================");

        BlackFridayDeal dealNotifier = new BlackFridayDeal();
        Customer customerA = new Customer("Sara");
        Customer customerB = new Customer("Jaheel");
        Customer customerC = new Customer("Bella");
        Customer customerD = new Customer("Gavin");

        dealNotifier.addCustomer(customerA);
        dealNotifier.addCustomer(customerB);
        dealNotifier.addCustomer(customerC);
        dealNotifier.addCustomer(customerD);

        System.out.println("Did someone say NEW DEAL!!");
        System.out.println("Announcing HEW BLACK FRIDAY DEALS");
        System.out.println("==================================\n");


        String dealMessage1 = "50% OFF STORE WIDE, SHOP WHILE IT LAST ";


        dealNotifier.notifyCustomers(dealMessage1);

    }
}





