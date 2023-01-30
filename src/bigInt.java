import java.math.BigInteger;

public class bigInt {
    public static void main(String[] args) {
        int n = 100;
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;
        BigInteger fib;

        System.out.println("First " + n + " Fibonacci numbers:");
        System.out.println(first);
        System.out.println(second);

        for (int i = 2; i < n; i++) {
            fib = first.add(second);
            System.out.println(fib);
            first = second;
            second = fib;
        }
    }
}
