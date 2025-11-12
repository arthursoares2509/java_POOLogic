import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int num1;
        int num2;
        int sum;
        
        System.out.print("Enter the first number: ");
        num1 = read.nextInt(); // read(num1)
        
        System.out.print("Enter the second number: ");
        num2 = read.nextInt(); // read(num2)
        
        //leia.nextLine() String / cadeia
        //leia.nextDouble() double / real
        //leia.nextFloat() float / real
        //leia.nextBoolean() logico / boolean
        
        sum = num1 + num2;
        
        System.out.println("The sum is: " + sum);
        
    }
}
