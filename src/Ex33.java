import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Ex33 {
public static void main(String[] args) {
	Queue<String> q = new LinkedList<String>();
	Queue<String> printQ = new LinkedList<String>();
	int[] krr = {1,1,9,1,1,1};
	String[] arr = new String[krr.length];
	for(int i = 0; i<krr.length; i++) {
		arr[i] = String.valueOf(krr[i]);
	}
	int index = 0;
	arr[index] = "0"+arr[index];
	for(int i = 0; i<arr.length; i++) {
		q.offer(arr[i]);
	}
	ArrayList list = new ArrayList();
	Queue k = null;
	while(true) {
		if(printQ.size()==krr.length) {
			break;
		}
		k= show(q,arr);
		printQ.add((String) k.poll());
	//	System.out.println(k);
	}
	for(int i = 0; i<arr.length;i++) {
		if(printQ.poll().length()==2) System.out.println(i+1);
	}
	


}
public static Queue show(Queue q,String[] arr) {
	for(int i = 0; i<q.size();i++) {
		for(int j = i; j<q.size();j++) {
			if(Integer.parseInt(arr[i])<Integer.parseInt(arr[j])) {
				q.remove(arr[i]);
				q.offer(arr[i]);
				break;
			}
		}
		
	}
	return q;

}

}
