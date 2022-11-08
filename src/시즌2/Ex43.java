import java.util.Scanner;

public class Ex43 {
	public static void main(String[] args) {
/*
 * 
 * 
 * 
크로아티아 알파벳	변경
č	c=
ć	c-
dž	dz=
đ	d-
lj	lj
nj	nj
š	s=
ž	z=
 */
		String[] krr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		Scanner sc = new Scanner(System.in);
		String k = sc.nextLine();
	//	int answer = 0;
		for(int i = 0; i<krr.length; i++) {
			if(k.contains(krr[i])) 
			{
				k = k.replace(krr[i], "_");
			}
		}
		System.out.println(k.length());
	}
}
