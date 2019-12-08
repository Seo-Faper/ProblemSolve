
public class Ex34 {
	public static void main(String[] args) {
		String k = "()(((()())(())()))(())";
		while(k.length()!=0) {
			System.out.println("----");
			System.out.println(k);
			k = k.replace("()", "1");
			System.out.println(k);
			k = k.replace("1", "");

		}
				
	}
}
