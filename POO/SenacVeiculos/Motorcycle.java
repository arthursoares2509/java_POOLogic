package SenacVeiculos;

public class Motorcycle implements Vehicle {
    private String model;
    private double value;

    public Motorcycle() {
    }

    public Motorcycle(double value) {
        this.value = value;
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
    
    @Override
    public double getTotal() {
        return value;
    }

    @Override
    public void displayInformation() {
        System.out.println("Model: " + model);
        System.out.println("Total value: " + getTotal());
    }
    
}
