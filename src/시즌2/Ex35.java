import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ex35 {
	public static void main(String[] args) {
		int[] arr =  {1,2,3,4,9,8,7};
		int index = 3;
		Queue<String> q = new LinkedList<String>();
		String J = q.poll();
		if(isPriorty(J,q)) {
			
		}else {
			print(J);
		}
		
	}

	private static void print(String j) {
		// TODO Auto-generated method stub
		
	}

	private static boolean isPriorty(String j, Queue<String> q) {
		// TODO Auto-generated method stub
		Iterator it = q.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		return false;
	}
}
