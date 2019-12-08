import java.util.Scanner;

public class Ex08 {
 public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
	 	int n = sc.nextInt();
	 	int x1,x2,y1,y2;
	 	int answer = 0;
	 	for(int i = 0; i<n; i++) {
	 		x1 = sc.nextInt();
	 		y1 = sc.nextInt();
	 		
	 		x2 = sc.nextInt();
	 		y2 = sc.nextInt();
	 		
	 		int c = sc.nextInt();
	 		for(int j = 0; j<c; j++) {
	 			if(slove(sc.nextInt(), sc.nextInt(), sc.nextInt(), x1, y1)) {
	 				
	 			}
	 		}
	 	}
 	}
 	public static boolean slove(int x, int y, int r, int a,int b) {
 		int S = (int) ((int) Math.pow((a-x), 2) + Math.pow((b-y), 2));
 		if(S<=r*r) {
 			return true;
 		}
 		return false;
 	}
}
