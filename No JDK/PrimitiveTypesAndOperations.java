public class PrimitiveTypesAndOperations {
    public static void main(String [] args) {
        int a = 7;
        long b = 10L;
        double c = 3.5;
        boolean flag = (a + b) > c;
        char ch = 'J';
        byte by = 2;
        short sh = 300;
        System.out.println("int: " + a);
        System.out.println("long: " + b);
        System.out.println("double: " + c);
        System.out.println("boolean: " + flag);
        System.out.println("char: " + ch);
        System.out.println("byte: " + by);
        System.out.println("short: " + sh);
        System.out.println("expression (a*b + c): " + (a * b + c));
    }
}
