import java.util.ArrayList;
import java.util.Scanner;
/*
 * 
 * 
 * �Է�
�Է��� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. �� �׽�Ʈ ���̽��� 10,000�� �����ʴ� �� �ڿ����� �̷���� �ִ�. ������ �ٿ��� 0�� 2�� �־�����. �� ���� ���� ���� ����.

���
�� �׽�Ʈ ���̽����� ù ��° ���ڰ� �� ��° ������ ������ factor��, ������ multiple��, �� �� �ƴ϶�� neither�� ����Ѵ�.
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
