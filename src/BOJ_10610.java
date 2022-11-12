import java.util.*;

public class BOJ_10610
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();
        int[] arr = new int[k.length()];
        int sum = 0;
        boolean zero = true;
        for(int i = 0; i< k.length(); i++){
            arr[i] = (k.charAt(i) - '0');
            sum += arr[i];
            if(arr[i] == 0) zero = false;
        }
        if(zero || sum % 3 !=0){ // 합이 3의 배수가 아니거나 0이 하나라도 없을 경우
            System.out.println(-1);
        }else{
            Arrays.sort(arr);
            for(int i = arr.length-1; i>=0; i--){
                System.out.print(arr[i]);
            }
        }
	}
}
