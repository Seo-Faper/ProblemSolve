import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex22 {
 public static void main(String[] args) {
	HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[8];
	for(int i = 0; i<8; i++) {
		arr[i] = sc.nextInt();
	}
	String[] krr = new String[8];
	for(int i = 0; i<8; i++) {
		krr[i] = arr[i]+" "+i;
	}
	Arrays.sort(krr);
 	int[] grr = new int[5];
 	int[] in = new int[5];
 	int sum = 0;
 	for(int i = 0; i<5; i++) {
 		 sum += grr[i] = Integer.parseInt(krr[7-i].substring(0, krr[7-i].length()-2));
 		 
 	}
 	for(int i = 7; i>2; i++) {
 		String[] f = krr[i].split(" ");
 		in[7-i] = Integer.parseInt(f[1]);
 		}
 	Arrays.sort(in);
 	System.out.println(sum);
 	
 }
}
