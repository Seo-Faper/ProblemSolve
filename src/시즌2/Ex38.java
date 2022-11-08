
import java.util.Scanner;

public class Ex38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] answers = new String[n];
		for(int i = 0; i<n; i++) {
			int k = sc.nextInt();
			int sum = 0;
			int[] score = new int[k];
			for(int j = 0; j<k; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
	//		System.out.println((float)sum/k);
			int arv = sum/k;
			int overArv = 0;
			for(int l = 0; l<k; l++) {
				if(score[l]>arv) overArv++;
			}
		//	System.out.println(overArv);
			answers[i] = ""+(overArv*1000000/k);
		}
		for(int i = 0; i<n; i++) {
			if(Integer.parseInt(answers[i].substring(5,6))>=5) {
				answers[i] = answers[i].substring(0,2)+"."+(Integer.parseInt(answers[i].substring(2,5))+1);
			}else {
				answers[i] = answers[i].substring(0,2)+"."+answers[i].substring(2,5);
			}
			System.out.println(answers[i]+"%");
		}
	}
}
