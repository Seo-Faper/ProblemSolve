import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Ex36 {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		int[] pro = {40, 93, 30, 55, 60, 65};
		int[] speed = {60, 1, 30, 5 , 10, 7};
		int[] answer = {};
	//	s.push(8);
		for(int i = 0; i<pro.length;i++) {
			if((100-pro[i])%speed[i]==0) {
				s.push((100-pro[i])/speed[i]);
			}else {
				s.push((100-pro[i])/speed[i]+1);
			}
			
		}
		
		System.out.println(s);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true) {
			if(s.isEmpty()) break;
			final int v = s.pop();
			//System.out.println(v);
			if(!s.stream().anyMatch(e -> e>v)) {
			//	System.out.println(v+"일 후 출시");
				list.add(v);
			}else {
			//System.out.println(	s.stream().filter(e -> e>v).sorted().max(Integer::compare).orElse(-1)+"일 후 출시");
			list.add(s.stream().filter(e -> e>v).sorted().max(Integer::compare).orElse(-1));
			
			}
		}
		Collections.sort(list);
		int[] arr = new int[list.size()];
		System.out.println(list);
		for(int i = 0; i<list.size();i++) {
			final int v = list.get(i);
			int count = (int)list.stream().filter(e -> e==v).count();
			//System.out.println(count);
			arr[i] = count;
		}
		answer = Arrays.stream(arr).distinct().toArray();
		
	}
}
