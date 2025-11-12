public class foodstoreinheritance {
    public static void main(String[] args) {
        Product[] productsArray = new Product[3];
        
        productsArray[0] = new Snack("Xis Bacon", "Complete", 29.90, 1200);
        productsArray[1] = new Drink("Chilled Coke", "With ice and lemon", 14.90, 2000);
        productsArray[2] = new Snack("Milk Pudding", "Lactose-free", 9.99, 250);
        
        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].showDetails();
            System.out.println("");
        }
    }
}