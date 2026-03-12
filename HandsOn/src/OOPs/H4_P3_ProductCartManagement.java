/*
 * This program implements a Product Cart Management System for an
 * online retail store. It allows users to add products to a shopping
 * cart, update product quantities, remove products, and automatically
 * calculate the total cost of all items in the cart.
 */
package OOPs;

import java.util.ArrayList;
import java.util.List;

class Product {

    private int productId;
    private String productName;
    private double price;
    private int quantity;

    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void setQuantity(int newQty) {
        if (newQty > 0) {
            quantity = newQty;
        } else {
            System.out.println("Invalid Quantity! Quantity must be greater than 0.");
        }
    }

    public double calculateTotal() {
        return price * quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void getProductDetails() {
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Cost   : " + calculateTotal());
        System.out.println("-----------------------------");
    }
}

class Cart {

    private List<Product> products;

    Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
        System.out.println("Product added to cart successfully.");
    }

    public void removeProduct(int productId) {
        boolean found = false;

        for (Product p : products) {
            if (p.getProductId() == productId) {
                products.remove(p);
                System.out.println("\nProduct removed from cart.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found in cart.\n");
        }
    }

    public double calculateCartTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.calculateTotal();
        }
        return total;
    }

    public void displayCartItems() {

        System.out.println("\nCART ITEMS");

        if (products.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        for (Product p : products) {
            p.getProductDetails();
        }

        System.out.println("TOTAL CART VALUE : " + calculateCartTotal());
    }
}


public class H4_P3_ProductCartManagement {

	public static void main(String[] args) {
		Cart cart = new Cart();

        Product p1 = new Product(1, "Laptop", 55000, 1);
        Product p2 = new Product(2, "Headphones", 1500, 2);
        Product p3 = new Product(3, "Mouse", 800, 3);

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.displayCartItems();

        p2.setQuantity(5);

        System.out.println("\nAfter updating quantity:");
        cart.displayCartItems();

        cart.removeProduct(3);

        System.out.println("\nAfter removing product:");
        cart.displayCartItems();
	}

}
