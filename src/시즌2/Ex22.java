package ½ÃÁğ2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ex22 {
	static int k = 0;
	public static void main(String[] args) {
		ArrayList<Integer> list = 
				new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(9);
		list.add(10);
		list.add(12);
		
		
		
		while(true) {
			if(isK()) {
				break;
			}
		}
		
		list.set(1, list.get(0)+list.get(1)*2);
		
		list.remove(0);
		
		Collections.sort(list, new Com());
		
	}
	private static boolean isK() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
class Com implements Comparator<Integer> {
	@Override public int compare(Integer a, Integer b) 
	{ return a.compareTo(b); } }
