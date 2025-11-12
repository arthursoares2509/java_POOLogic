public class Car implements Vehicle{
    
    @Override
    public void accelerate(){
        System.out.println("Accelerating the car");
    }
    
    @Override
    public void brake(){
        System.out.println("Braking the car");
    }
}
