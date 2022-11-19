import java.util.Scanner;

public class BOJ_1780 {
    static int[][] board;
    static int white;
    static int gray;
    static int black;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        board = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = sc.nextInt();
            }
        }
        partition(0, 0, n);
        System.out.println(black);
        System.out.println(white);
        System.out.println(gray);
 
    }
    public static void partition(int x,int y, int size){
        if(boardCheck(x,y,size)){
            if(board[x][y]==0) white++;
            else if(board[x][y]==1)gray++;
            else black++;

            return;
        }

        int newSize = size/3;
        partition(x, y, newSize);
        partition(x, y+newSize, newSize);
        partition(x, y+2*newSize, newSize);

        partition(x+newSize, y, newSize);
        partition(x+newSize, y+newSize, newSize);
        partition(x+newSize, y+2*newSize, newSize);

        partition(x+2*newSize, y, newSize);
        partition(x+2*newSize, y+newSize, newSize);
        partition(x+2*newSize, y+2*newSize, newSize);
    }
    public static boolean boardCheck(int x, int y, int size){
        int color = board[x][y];
        for(int i = x; i < x + size; i++){
            for(int j = y; j < y + size; j++){
                if (board[i][j] != color) return false; 
            }
        }
        return true;
    }
}
