import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_1850 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            long A = sc.nextLong();
            long B = sc.nextLong();
            BigInteger a = BigInteger.valueOf(A);
            BigInteger b = BigInteger.valueOf(B);
            BigInteger gcd = a.gcd(b);
            
            for(long i = 0; i < gcd.longValue(); i++){
                bw.write("1");
            }
            bw.close();
            System.out.println();
        

    }
}
