import java.util.Scanner;
/*
 * 
 * advertise
does not matter
do not advertise
 * 
 */
public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			int r = sc.nextInt();
			int e = sc.nextInt();
			int c = sc.nextInt();
			slove(r,e,c);	
		}
		
	}
	public static void slove(int r, int e, int c) {
		int ad = e-c;
		if(r<ad) {
			System.out.println("advertise");
		}else if(r==ad) {
			System.out.println("does not matter");
		}else {
			System.out.println("do not advertise");
		}
	}
}
