package ½ÃÁð2;

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] rgb = new int[3];
		int min =0;
		int index = -1;
		int sum = 0;
		for(int i = 0; i<n; i++) {
			rgb[0] = sc.nextInt();
			rgb[1] = sc.nextInt();
			rgb[2] = sc.nextInt();
			if(index != -1) {
				rgb[index] = 257;
			}
			//System.out.println(min);
			
			if(rgb[0]<rgb[1] && rgb[0]<rgb[2]) {
				min = rgb[0];
				index = 0;
			}
			if(rgb[1]<rgb[0] && rgb[1]<rgb[2]) {
				min = rgb[1];
				index = 1;
			}
			if(rgb[2]<rgb[0] && rgb[2] < rgb[1]) {
				min = rgb[2];
				index = 2;
			}
			System.out.println(min+","+index);
			sum +=min;
	
		}
		System.out.println(sum);
	}
}
