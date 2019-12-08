import java.util.Arrays;
import java.util.Scanner;

public class Ex12 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] bugger = new int[3];
	int[] dring = new int[2];
	for(int i = 0; i<3; i++) {
		bugger[i] = sc.nextInt();
	}
	for(int i = 0; i<2; i++) {
		dring[i] = sc.nextInt();
	}
	Arrays.sort(bugger);
	Arrays.sort(dring);
	System.out.println(bugger[0]+dring[0]-50);
 }
}
