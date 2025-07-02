package CollectionOperations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

    static class Product implements Comparable<Product> {

        String productName;
        String brand;
        String category;
        double price;
        int productId;

        public Product(String productName, String brand, String category, double price, int productId) {
            this.productName = productName;
            this.brand = brand;
            this.category = category;
            this.price = price;
            this.productId = productId;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getProductId() {
            return productId;
        }

        public void setProductId(int productId) {
            this.productId = productId;
        }

        @Override
        public String toString() {
            return "Product [productName=" + productName + ", brand=" + brand + ", category=" + category + ", price="
                    + price + ", productId=" + productId + "]";
        }

        @Override // override compareTo() method of Collection class to sort by User-defined Objects
        public int compareTo(Product prod) {
            // return this.getProductName().compareTo(prod.productName);    // sort the elements in ascending order of productName
            // return this.getCategory().compareTo(prod.getCategory());     // sort the elements in ascending order of category
            // return prod.getCategory().compareTo(this.getCategory());     // sort the elements in descending order of category
            // return ((Double) this.getPrice()).compareTo(prod.getPrice());   // sort the elements in ascending order of Price


            // If Two categories are same then sort according to productName
            if(this.getCategory().compareTo(prod.getCategory()) == 0){  
                 return this.getProductName().compareTo(prod.productName); 
            } 
            return this.getCategory().compareTo(prod.getCategory());
        }

    }

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(new Product("Mobile", "Samsung", "Electronic Device", 500, 101),
                new Product("Laptop", "Dell", "Electronic Device", 1200, 102),
                new Product("Headphones", "Sony", "Electronic Accessory", 150, 103),
                new Product("Refrigerator", "LG", "Home Appliance", 800, 104),
                new Product("Smartwatch", "Apple", "Wearable", 400, 105),
                new Product("Television", "Panasonic", "Electronic Device", 700, 106));

        System.out.println();

        // for (Product product : products) {
        //     System.out.println(product);
        // }

        Collections.sort(products);
        // System.out.println("\nProducts after sorting by productName:");
        // for (Product product : products) {
        //     System.out.println(product);
        // }

        // System.out.println("\nProducts after sorting by Category:");
        // for (Product product : products) {
        //     System.out.println(product);
        // }

        // System.out.println("\nProducts after sorting by Price:");
        // for (Product product : products) {
        //     System.out.println(product);        // get full details of product List
        //     System.out.println(product.getProductName());   // gets only ProductName After Sorting
        // }

        System.out.println("\nIf Categories are same then Products are sorted by ProductName:");
        for (Product product : products) {
            System.out.println(product);
        }

    }

}
