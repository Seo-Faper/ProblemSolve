import java.util.Scanner;

public class BOJ_1531 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] map = new int[100][100];
        for(int i = 0; i<n; i++){
        
            int x1 = sc.nextInt()-1;
            int y1 = sc.nextInt()-1;
            int x2 = sc.nextInt()-1;
            int y2 = sc.nextInt()-1;

            for(int x = x1; x <= x2; x++){
                for(int y = y1; y <= y2; y++){
                    map[x][y] +=1;
                }
             }
        }
        int ans = 0;
        for(int i = 0; i<100; i++){
            for(int j = 0; j<100; j++){
                if(map[i][j] > k) ans++;
            }

        }
        System.out.println(ans);
    }       
}
