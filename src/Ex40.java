import java.util.ArrayList;

public class Ex40 {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		for(int i = 1; i<=9999; i++) list.add(i);
		for(int i = 0; i<list.size(); i++) {
			list = generateList(list.get(i));
		}
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	private static ArrayList<Integer> generateList(int n) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ns = new ArrayList<Integer>();

		while(true) {
			if(n>9999) break;
			char[] num = String.valueOf(n).toCharArray();
			for(int i = 0; i<num.length; i++) {
				n += (num[i]-48);
			}
			ns.add(n);
		}
		for(int i = 0; i<ns.size(); i++) {
			int index = ns.get(i);
			for(int j = 0; j<list.size(); j++) {
				if(list.get(j)==index) list.remove(j);
			}
		}
		return list;
	}

}
