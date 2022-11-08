import java.util.Scanner;
import java.util.stream.Stream;

public class Ex24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		String[] k = new String[5];
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<4; j++) {
				arr[i] += sc.nextInt();
			}
			k[i] =String.valueOf(arr[i])+" "+(i+1);
		}
		Stream.of(k).sorted().skip(4).map(e -> e.split(" ")).forEach(e->System.out.println(e[1]+" "+e[0]));;
	}
}
