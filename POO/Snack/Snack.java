import java.util.Scanner;

public class Snack {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        Produto p = new Produto(); 

        Produto p2 = new Produto(2, "Xis", "Bacon", 25.90);

        Produto p3 = new Produto();

        p.setId(1);
        p.setName("Pastel");
        p.setDescription("Meat with egg");
        p.setValue(4.99);

        p.displayData();
        
        System.out.println("");
        
        p2.displayData();
        
        System.out.print("\n");
        
        System.out.print("Enter the ID: ");
        p3.setId(read.nextInt());
        read.nextLine(); 
        
        System.out.print("Enter the product name: ");
        p3.setName(read.nextLine());
        
        System.out.print("Enter the product description: ");
        p3.setDescription(read.nextLine());
        
        System.out.print("Enter the product value: ");
        p3.setValue(read.nextDouble());
        read.nextLine();
        
        p3.displayData();
        
    }
}
