
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Ex31 {
	public static void main(String[] args) {
	        String[][] clothes = {{"노랑모자","머리"},{"파란안경","모자"},{"초록터빈","신발"}};	
	        String[] a = new String[clothes.length];
	        int answer = 1;
	        for(int i = 0; i<clothes.length; i++){
	            a[i] = clothes[i][1];
	        }
			HashMap map = new HashMap();
			int tmp = 0;
			for(int i = 0; i<a.length;i++) {
				for(int j = 0; j<a.length; j++) {
					if(a[i].equals(a[j])) tmp++;
				}
				map.put(a[i], tmp);
				tmp = 0;
			}
			Collection values = map.values();

		    Iterator it = values.iterator();
		    while(it.hasNext()) {
		    	answer *=((int)it.next()+1);
		    }
		    System.out.println(answer-1);
	}
	
}//해결
