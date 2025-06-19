public class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String display() {
        return "[" + productId + "] " + productName + " (" + category + ")";
    }
}
