public class MethodsAndOverLoading {
   public static void main(String[] args) {
    System.out.println("sum(int): " + sum(2, 3));
            System.out.println("sum(double): " + sum(2.5, 3.1));
        }
    
        static int sum(int a, int b) {
            return a + b;
        }
    
        static double sum(double a, double b) {
            return a + b;
        }
   } 
}