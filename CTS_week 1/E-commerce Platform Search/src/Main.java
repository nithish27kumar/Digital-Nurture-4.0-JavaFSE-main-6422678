import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Mobile", "Electronics"),
            new Product(104, "Shirt", "Clothing"),
            new Product(105, "Watch", "Accessories")
        };

        // 🔍 Linear Search for "Shoes"
        Product linearResult = SearchService.linearSearch(products, "Shoes");
        System.out.println("Linear Search Result:\n");
        System.out.println(linearResult != null ? linearResult.display() : "Product not found");

        // 🔃 Sort products before Binary Search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // 🔍 Binary Search for "Watch"
        Product binaryResult = SearchService.binarySearch(products, "Watch");
        System.out.println("\nBinary Search Result:\n");
        System.out.println(binaryResult != null ? binaryResult.display() : "Product not found");
    }
}
