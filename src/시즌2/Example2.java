import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int jmt = 0;
		double[] list  = new double[n];
		
		for(int i = 0; i<n; i++) {
			int k = sc.nextInt();
			int[] score = new int[k];
			for(int j = 0; j<k; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			String www = "ff";
			www.equals("");
			
			list[i] = sum/k;
			for(int v = 0; v<k; v++) {
				if(list[i]<score[v]) {
					jmt++;
				}
			}
		//	System.out.println(jmt+","+k);
			list[i] = (double)jmt/k*100;
			jmt = 0;
			sum = 0;
			
		}
		for(int i = 0; i<n; i++) System.out.printf("%.3f\n",list[i]);
	}


}
