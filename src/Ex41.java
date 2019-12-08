import java.util.Arrays;
import java.util.Scanner;

public class Ex41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] k = new String[n+1];
		for(int i = 0; i<n+1; i++) {
			k[i] = sc.nextLine();
		}
	//	System.out.println(Arrays.toString(k));
		for(int i = 1; i<k.length; i++) {
			String a = "";
			int count = Integer.parseInt(k[i].split(" ")[0]);
			char[] s = k[i].split(" ")[1].toCharArray();
			for(int j = 0; j<s.length; j++) {
				for(int m = 0; m<count; m++) a+=s[j];
			}
			System.out.println(a);
		}
	}
}
