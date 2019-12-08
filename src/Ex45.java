import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Ex45 {
	static String c = "";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		sc.close();
		name = name.toLowerCase();
		name.chars().distinct().sorted().forEach(e->{
			c+=(char)e;
		});
	//	System.out.println(c);
		int[] count = new int[c.length()];
		for(int i = 0; i<name.length(); i++) {
			for(int j = 0; j<c.length(); j++) {
				if(name.charAt(i)==c.charAt(j)) {
					count[j]++;
				}
			}
		}
	//	System.out.println(Arrays.toString(count));
		int max = 0;
		char cmax = '0';
		for(int i = 0; i<c.length(); i++) {
		//	System.out.println(max+","+cmax);
			for(int j = i; j<c.length(); j++) {
				if(max < count[j]) {
					max = count[j];
					cmax = c.charAt(j);
				}
			}
		}

		int flag = 0;
		for(int i = 0; i<count.length; i++) {
			if(max==count[i])flag++;
		}
		if(flag>=2)System.out.println("?");
		else System.out.println((""+cmax).toUpperCase());
	}
}
