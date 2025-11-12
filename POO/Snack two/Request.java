public class Order {
    
    private int quantity;
    private Product product;

    public Order(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public Order() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public double calculateTotal() {
        double total = 0;
        total = this.quantity * product.getValue();
        return total;
    }
}
