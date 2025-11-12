package senacveiculos;

public class Car implements Vehicle {
    private String model;
    private double value;
    private double additionalTaxes;
    private double discount;
    
    public Car() {
        
    }
    
    public Car(double value, double additionalTaxes, double discount) {
        this.value = value;
        this.additionalTaxes = additionalTaxes;
        this.discount = discount;
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public double getValue() {    
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getAdditionalTaxes() {
        return additionalTaxes;
    }

    public void setAdditionalTaxes(double additionalTaxes) {
        this.additionalTaxes = additionalTaxes;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {    
        this.discount = discount;
    }
   
    @Override
    public double getTotal() {
        return value + additionalTaxes - discount;
    }
    
    @Override
    public void displayInformation() {
        System.out.println("Model: " + model);
        System.out.println("Total value: " + getTotal());
    }
    
}
