import java.util.Arrays;
import java.util.Scanner;

public class Ex44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] krr = new String[n];
		for(int i = 0; i<krr.length; i++) {
			krr[i] = sc.next();
		}
		int answer = 0;
		
		//이웃한 문자열 모두 제거 후 아래 실행하면 정답
		
		for(int i = 0; i<krr.length; i++) {
			for(int j = 0; j<krr[i].length()-1; j++) {
				if(krr[i].charAt(j)==krr[i].charAt(j+1)) {
					String a = ""+krr[i].charAt(j)+""+krr[i].charAt(j+1);
					krr[i] = krr[i].replace(a, ""+krr[i].charAt(j));
					j--;
				}
			}
		}
	//	System.out.println(Arrays.toString(krr));
		for(int i = 0; i<krr.length; i++) {
			boolean flag = true;
			for(int j = 0; j< krr[i].length(); j++) {
					if(krr[i].substring(j+1, krr[i].length()).contains(""+krr[i].charAt(j))) {
						flag = false;
						break;
					}else {
						flag = true;
				}
			}
			if(flag) answer++;
		}
		System.out.println(answer);
	}
}
