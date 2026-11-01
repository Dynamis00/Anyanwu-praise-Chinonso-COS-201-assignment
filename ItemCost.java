import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        
        System.out.print("Enter unit price: ");
        double price = scanner.nextDouble();
        
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double totalCost = price * quantity;
        
        System.out.println("\n--- Receipt ---");
        System.out.println("Item: " + itemName);
        System.out.println("Total Cost: " + totalCost);
        
        scanner.close();
    }
}