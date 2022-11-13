import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_13241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(lcm(a,b));
    }
    public static long lcm(long x, long y){
        BigInteger b1 = BigInteger.valueOf(x);
        BigInteger b2 = BigInteger.valueOf(y);
        BigInteger gcd = b1.gcd(b2);
        return (x* y) / gcd.longValue();
    }
}
