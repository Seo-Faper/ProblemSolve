import java.util.Scanner;
/*
 * 
 * 
 * 12345689

1의 자리일 땐 간격이 없음, 즉 k번째 수는 n과 동일

101112 일 때, 

10번째 수 : 1
11번째 수 : 0 (1:0)

12번째 수 : 1
13번째 수 : 1 (3:1)

14번째 수 : 1
15번째 수:  2 (5:2)

16번째 수 : 1
17번째 수 : 3 (7:3)

 
18번째 수:  1
19번째 수:  4 (9:4)

20 : 1
21 : 5

22 : 1
23 : 6

24 : 1
25 : 7

26 : 1
27 : 8

28 : 1
29: 9



n이  10~19 일 때는  짝수 번째 수는 1, 홀수 번째 수는 (k-11) // 2 
n이  20~29 일 때는?


 */
public class BOJ_1790 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();


    }
}
