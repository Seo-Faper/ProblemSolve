import java.util.Scanner;

public class Ex59 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] value = new int[n][2];
		int maxA = 0;
		int maxB = 0;
		for(int i = 0; i<n; i++) {
			int a = sc.nextInt();
			maxA = Math.max(maxA,a);
			int b = sc.nextInt();
			maxB = Math.max(maxB,b);
			value[i][0] = a;
			value[i][1] = b;
		}
		int[][] map = new int[maxA+2][maxB];
		for(int i = 0; i<map.length; i++) {
			for(int j = 0; j<map[i].length; j++) {
				if(i==0) {
					map[i][j] = (i+1);
				}else if(j==0){
					map[i][j] = 1;
				}else {
					map[i][j] = map[i-1][j] + map[i][j-1];
				}
			}
		}

		for(int i = 0; i<value.length; i++) {
			System.out.println(map[value[i][0]+1][value[i][1]-1]);
		}
	}

}
