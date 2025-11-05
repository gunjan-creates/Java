package Streams;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Comprehensive example demonstrating Java Stream API operations.
 * Shows filter, map, reduce, collect, and other common stream operations.
 */
public class StreamOperationsExample {
    static class Product {
        private String name;
        private double price;
        private String category;

        public Product(String name, double price, String category) {
            this.name = name;
            this.price = price;
            this.category = category;
        }

        public String getName() { return name; }
        public double getPrice() { return price; }
        public String getCategory() { return category; }

        @Override
        public String toString() {
            return String.format("%s ($%.2f) - %s", name, price, category);
        }
    }

    public static void main(String[] args) {
        // Create sample data
        List<Product> products = Arrays.asList(
            new Product("Laptop", 999.99, "Electronics"),
            new Product("Phone", 599.99, "Electronics"),
            new Product("Book", 29.99, "Books"),
            new Product("Tablet", 299.99, "Electronics"),
            new Product("Desk", 199.99, "Furniture"),
            new Product("Chair", 89.99, "Furniture")
        );

        // 1. Basic filtering and mapping
        System.out.println("Electronics under $600:");
        products.stream()
               .filter(p -> p.getCategory().equals("Electronics"))
               .filter(p -> p.getPrice() < 600.0)
               .map(Product::getName)
               .forEach(name -> System.out.println("- " + name));

        // 2. Collecting to different collections
        Map<String, List<Product>> byCategory = products.stream()
            .collect(Collectors.groupingBy(Product::getCategory));
        
        System.out.println("\nProducts by category:");
        byCategory.forEach((category, prods) -> {
            System.out.println(category + ":");
            prods.forEach(p -> System.out.println("  - " + p.getName()));
        });

        // 3. Complex reduction operations
        double totalElectronics = products.stream()
            .filter(p -> p.getCategory().equals("Electronics"))
            .map(Product::getPrice)
            .reduce(0.0, Double::sum);
        
        System.out.printf("\nTotal cost of electronics: $%.2f%n", totalElectronics);

        // 4. Finding maximum/minimum
        Optional<Product> mostExpensive = products.stream()
            .max(Comparator.comparingDouble(Product::getPrice));
        
        mostExpensive.ifPresent(p -> 
            System.out.printf("\nMost expensive product: %s ($%.2f)%n", 
                p.getName(), p.getPrice()));

        // 5. Statistics
        DoubleSummaryStatistics priceStats = products.stream()
            .mapToDouble(Product::getPrice)
            .summaryStatistics();
        
        System.out.println("\nPrice Statistics:");
        System.out.printf("Count: %d%n", priceStats.getCount());
        System.out.printf("Average: $%.2f%n", priceStats.getAverage());
        System.out.printf("Min: $%.2f%n", priceStats.getMin());
        System.out.printf("Max: $%.2f%n", priceStats.getMax());
        System.out.printf("Sum: $%.2f%n", priceStats.getSum());

        // 6. Partitioning
        Map<Boolean, List<Product>> partitioned = products.stream()
            .collect(Collectors.partitioningBy(p -> p.getPrice() > 500));
        
        System.out.println("\nExpensive products (over $500):");
        partitioned.get(true).forEach(p -> System.out.println("- " + p));
        
        System.out.println("\nAffordable products ($500 or less):");
        partitioned.get(false).forEach(p -> System.out.println("- " + p));

        // 7. String joining
        String productNames = products.stream()
            .map(Product::getName)
            .collect(Collectors.joining(", "));
        
        System.out.println("\nAll products: " + productNames);
    }
}