public class Product {
    private final String name;
    private final String category;
    private final double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getters
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Product: " + name + " | Category: " + category + " | Price: $" + price;
    }
}
