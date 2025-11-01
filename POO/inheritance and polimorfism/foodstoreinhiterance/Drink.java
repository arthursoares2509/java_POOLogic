public class Drink extends Product {
    private int ml;

    public Drink() {
    }

    public Drink(String name, String description, double price, int ml) {
        super(name, description, price);
        this.ml = ml;
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }
    
    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Drink Size: " + this.ml);
    }
}
