import java.util.Scanner;

public class Ex60 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i<T; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(f(h,w,n));
		}
	}

	private static String f(int h, int w, int n) {
		// TODO Auto-generated method stub
		int XX = n%h;
		int YY = n/h+1;
		if(n%h==0) {
			XX = h;
			YY = n/h;
		}
		if(YY<10)
		return XX+"0"+YY;
		else
			return XX+""+YY;
	}
}
