import java.util.Scanner;

public class BOJ_2875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
      
        int g_team = n/2; // 여자 팀 결성 가능한 수
        int b_team = m; // 남자는 1명만 있으면 됨

        int curr_team = Math.min(g_team, b_team); // 팀 결성 가능 인원 중 더 작은 쪽으로 맞춤 
        int etc_p = n+m - 3*curr_team; // 나머지 남은 인원들 

        k -= etc_p; // k에 나머지 인원 주면 됨
     //   System.out.println(etc_p+","+k);
        // 이 때 k가 0보다 크다면 결성된 팀을 해체 해서 인원을 충당해야함, 한 팀이 해체 될 때 마다 etc_p는 3씩 증가 
        if(k > 0){
          //  System.out.println((k / 3) + ( (k % 3) == 0 ? 0 : 1));
            curr_team -= (k / 3) + ( (k % 3) == 0 ? 0 : 1);
        }
        System.out.println(curr_team);
        
    }
}
