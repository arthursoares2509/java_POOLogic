import java.util.Scanner;

public class Diner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        String response = "y";

        do {
            System.out.println("Enter the product name: ");
            String name = scanner.nextLine();

            System.out.println("Enter the product description: ");
            String description = scanner.nextLine();

            System.out.println("Enter the product price: ");
            double price = scanner.nextDouble();

            Product product = new Product(name, description, price);

            System.out.println("Enter the quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            OrderItem orderItem = new OrderItem(quantity, product);

            System.out.println("The total is: " + orderItem.calculateTotal());
            order.addOrderItemToList(orderItem);

            System.out.println("Do you want to continue? (y/n): ");
            response = scanner.nextLine();
            
        } while (response.equals("y"));
        order.listOrders();

    }
}
