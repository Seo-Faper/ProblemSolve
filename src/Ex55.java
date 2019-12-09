import java.util.ArrayList;
import java.util.Scanner;
/*
 * 
 * 
 * 입력
입력은 여러 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 10,000이 넘지않는 두 자연수로 이루어져 있다. 마지막 줄에는 0이 2개 주어진다. 두 수가 같은 경우는 없다.

출력
각 테스트 케이스마다 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 출력한다.
 * 
 */
public class Ex55 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		ArrayList<String> list = new ArrayList<String>();
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a==0 && b==0) break;
			else if(b%a==0 && b>a) {
				list.add("factor");
			}else if(a%b==0 && a>b) {
				list.add("multiple");
			}else {
				list.add("neither");
			}
		}
		for(String k : list) {
			System.out.println(k);
		}
	}
}
