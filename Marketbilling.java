import java.util.Scanner;

public class Marketbilling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double taxRate = 0.08; // Example tax rate (8%)

        System.out.println("--- Welcome to the Market Billing System ---");

        while (true) {
            System.out.println("\n1. Add product to cart");
            System.out.println("2. Generate bill");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter product price: $");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();

                    double itemTotal = price * quantity;
                    total += itemTotal;

                    System.out.println(productName + "\t$" + price + "\tQuantity: " + quantity + "\tTotal: $" + itemTotal);
                    break;

                case 2:
                    if (total == 0.0) {
                        System.out.println("Cart is empty. Add products to generate bill.");
                    } else {
                        double taxAmount = total * taxRate;
                        double finalTotal = total + taxAmount;

                        System.out.println("\n--- Your Bill ---");
                        System.out.println("Subtotal: $" + total);
                        System.out.println("Tax (8%): $" + taxAmount);
                        System.out.println("Total Amount: $" + finalTotal);
                        System.out.println("-----------------");

                        // Reset total for next customer or exit
                        total = 0.0;
                    }
                    break;

                case 3:
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}