import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex32 {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		String[] g = {"클래식","팝","클래식","클래식","팝"};
		int[] plays = {500,600,150,800,2500};
		for(int i = 0; i<g.length;i++) {
			map.put(plays[i], g[i]);
		}
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
	}
}
