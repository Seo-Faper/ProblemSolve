import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float[] list = new float[n];
		ArrayList k = new ArrayList();
		for(int i = 0; i<n; i++) {
			int a = sc.nextInt();
			k.add(a);
			list[i] = a;
		}
		int  max = (Integer) Collections.max(k);
		System.out.println(max);
		double sum = 0;
		for(int i = 0; i<n; i++) {
			sum +=list[i]/max*100;
		}
		System.out.printf("%.6f",sum/n);
		
	}

}
