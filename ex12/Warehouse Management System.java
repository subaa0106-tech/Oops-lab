import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private int productId;
    private String warehouseSection;
    private int stock;

    Product(int productId, String warehouseSection, int stock) {
        this.productId = productId;
        this.warehouseSection = warehouseSection;
        this.stock = stock;
    }

    public int getProductId() {
        return productId;
    }

    public String getWarehouseSection() {
        return warehouseSection;
    }

    public int getStock() {
        return stock;
    }

    public void updateStock(int quantity) {
        if (stock + quantity < 0) {
            throw new IllegalArgumentException(
                "Stock cannot be negative!"
            );
        }
        stock += quantity;
    }

    public void display() {
        System.out.println(
            productId + "\t\t" + warehouseSection + "\t\t" + stock
        );
    }
}

public class WarehouseManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        try {
            products.add(new Product(101, "A1", 50));
            products.add(new Product(102, "B1", 30));
            products.add(new Product(103, "C1", 75));

            System.out.println("===== WAREHOUSE MANAGEMENT SYSTEM =====");

            while (true) {
                System.out.println("\n1. Display Products");
                System.out.println("2. Add Product");
                System.out.println("3. Search Product");
                System.out.println("4. Update Stock");
                System.out.println("5. Exit");

                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println(
                            "\nProduct ID\tWarehouse Section\tStock"
                        );
                        System.out.println(
                            "-------------------------------------------"
                        );

                        for (Product p : products) {
                            p.display();
                        }
                        break;

                    case 2:
                        System.out.print("Enter Product ID: ");
                        int id = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Warehouse Section: ");
                        String section = sc.nextLine();

                        System.out.print("Enter Stock: ");
                        int stock = sc.nextInt();

                        if (stock < 0) {
                            throw new IllegalArgumentException(
                                "Stock cannot be negative!"
                            );
                        }

                        products.add(
                            new Product(id, section, stock)
                        );

                        System.out.println(
                            "Product added successfully!"
                        );
                        break;

                    case 3:
                        System.out.print(
                            "Enter Product ID to search: "
                        );
                        int searchId = sc.nextInt();

                        boolean found = false;

                        for (Product p : products) {
                            if (p.getProductId() == searchId) {

                                System.out.println("\nProduct Found!");
                                System.out.println(
                                    "Product ID: " + p.getProductId()
                                );
                                System.out.println(
                                    "Warehouse Section: "
                                    + p.getWarehouseSection()
                                );
                                System.out.println(
                                    "Stock: " + p.getStock()
                                );

                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Product not found!");
                        }
                        break;

                    case 4:
                        System.out.print("Enter Product ID: ");
                        int updateId = sc.nextInt();

                        System.out.print(
                            "Enter stock quantity to add/remove: "
                        );
                        int quantity = sc.nextInt();

                        boolean updated = false;

                        for (Product p : products) {
                            if (p.getProductId() == updateId) {

                                p.updateStock(quantity);

                                System.out.println(
                                    "Stock updated successfully!"
                                );
                                System.out.println(
                                    "New Stock: " + p.getStock()
                                );

                                updated = true;
                                break;
                            }
                        }

                        if (!updated) {
                            System.out.println("Product not found!");
                        }
                        break;

                    case 5:
                        System.out.println(
                            "Thank you for using Warehouse Management System!"
                        );
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }
}