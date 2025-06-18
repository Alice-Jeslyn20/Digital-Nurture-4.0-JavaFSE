import java.util.ArrayList;
import java.util.List;

public class ECommercePlatform {
    private final List<Product> products;

    public ECommercePlatform() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    // Search by category
    public List<Product> searchByCategory(String category) {
        List<Product> results = new ArrayList<>();
        for (Product p : products) {
            if (p.getCategory().equalsIgnoreCase(category)) {
                results.add(p);
            }
        }
        return results;
    }

    // Search by keyword in name
    public List<Product> searchByKeyword(String keyword) {
        List<Product> results = new ArrayList<>();
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(p);
            }
        }
        return results;
    }
}
