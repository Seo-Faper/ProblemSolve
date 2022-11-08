import java.util.Scanner;

public class Ex42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String k = sc.nextLine();
		sc.close();
		String[] dialog = {"2ABC", "3DEF", "4GHI", "5JKL", "6MNO", "7PQRS", "8TUV", "9WXYZ"};
		char[] a = k.toCharArray();
	//	System.out.println(k);
		int answer = 0;
		for(int i = 0; i<k.length(); i++) {
			String str = ""+a[i];
			for(int j = 0; j<dialog.length; j++) {
			//	System.out.println("in");
				if(dialog[j].contains(str)) {
					answer +=Integer.parseInt(dialog[j].substring(0,1));
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}
