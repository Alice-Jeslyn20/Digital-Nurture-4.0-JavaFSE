import java.util.List;

public class Main {
    public static void main(String[] args) {
        ECommercePlatform platform = new ECommercePlatform();

        // Add some products
        platform.addProduct(new Product("iPhone 14", "Electronics", 999.99));
        platform.addProduct(new Product("Galaxy S23", "Electronics", 899.99));
        platform.addProduct(new Product("Nike Running Shoes", "Footwear", 120.00));
        platform.addProduct(new Product("Leather Wallet", "Accessories", 45.50));

        // Search by category
        System.out.println("Searching for Electronics:");
        List<Product> electronics = platform.searchByCategory("Electronics");
        for (Product p : electronics) {
            System.out.println(p);
        }

        System.out.println();

        // Search by keyword
        System.out.println("Searching for products containing 'shoe':");
        List<Product> keywordSearch = platform.searchByKeyword("shoe");
        for (Product p : keywordSearch) {
            System.out.println(p);
        }
    }
}
