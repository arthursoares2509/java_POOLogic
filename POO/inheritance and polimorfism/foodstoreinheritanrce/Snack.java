public class Snack extends Product {

    private int caloricValue;

    public Snack() {
    }

    public Snack(String name, String description, double price, int caloricValue) {
        super(name, description, price);
        this.caloricValue = caloricValue;
    }

    public int getCaloricValue() {
        return caloricValue;
    }

    public void setCaloricValue(int caloricValue) {
        this.caloricValue = caloricValue;
    }
    
    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Caloric Value: " + this.caloricValue);
    }
}
