package ½ÃÁð2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex02 {
	
	static int i = 0;
	
	public static void main(String[] args) {
		
		int p[] = {93,30,55};
		int s[] = {1,30,5};
		int day1[] = new int[p.length];
		for(int i = 0; i<p.length;i++) {
			if((100-p[i])%s[i]!=0) {
				day1[i] = (100-p[i])/s[i]+1;
			}
			else {
				day1[i] = (100-p[i])/s[i];
				}
		}
		int[] day = {1,2,3,2,1};
		
		//int[] w = {7,2,3,9};
		ArrayList<String> list = new ArrayList<String>();
		list.stream().distinct();
		String seq = "URL";
		seq.toCharArray();
		seq.chars().sorted().forEach(e-> System.out.println((char)e));
		Queue<Integer> q = new LinkedList<Integer>();
		q.stream().sorted();
		Stack<Character> sk =new Stack<Character>();
		Stack<Character> sk2 =new Stack<Character>();
		sk.push('C');
		sk.push('B');
		sk.sort(null);
		System.out.println(sk);
		sk2.clear();
		
		}
}