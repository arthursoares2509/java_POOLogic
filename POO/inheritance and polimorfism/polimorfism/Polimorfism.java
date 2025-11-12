public class Polimorfism {
    public static void main(String[] args) {
        
        Vehicle[] vehicleList = new Vehicle[2];
        
        Vehicle v1 = new Car();
        Vehicle v2 = new Motorcycle();
        
        v1.Polimorfism();
        v2.brake();
    }
}
