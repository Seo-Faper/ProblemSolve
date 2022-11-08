import java.util.Arrays;
import java.util.Scanner;

public class Ex37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float[] score = new float[n];
		float max = 0;
		for(int i = 0; i<n; i++) {
			score[i] = sc.nextFloat();
				max = Math.max(max,score[i]);
		}
		sc.close();
//		System.out.println(max);
		 float sum = 0;
		for(int i = 0; i<n; i++) {
			score[i] = score[i]*100 / max;
			sum +=score[i];
		}
	//	System.out.println(sum);
		float arv = sum/n;
		System.out.println(arv);
	}
}
