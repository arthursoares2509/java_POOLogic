public class IfElseAndTernary {
    public static void main(String [] args){
        int x = 9;
        if (x % 2 == 0) {
            System.out.println(x + "is even");
        }
        else {
            System.out.println(x + "is odd");
        }

        String parity = (x % 2 == 0) ? "even" : "odd";
        System.out.println("ternary: " + parity);
    }
}
