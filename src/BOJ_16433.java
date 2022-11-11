import java.util.Scanner;

public class BOJ_16433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        String[][] map = new String[n][n];
        

        for(int i = 0; i<n; i++){
            for(int j = 0; j< n; j++){
                if(Math.abs(x-y) % 2 == 0){
                    if(Math.abs(i-j) % 2 == 0){
                        map[i][j] = "v";
                    }else map[i][j] = ".";
                }else{
                    if(Math.abs(i-j) % 2 == 0){
                        map[i][j] = ".";
                    }else map[i][j] = "v";
                }
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
