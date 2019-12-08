package 시즌2;

public class Ex05 {
public static void main(String[] args) {
	Ex05 x = new Ex05();
	String[] w = {"tank","kick","know","wheel","land","dream",
			"mother","robot","tank"};
	String[] w2 = {"hello", "one", "even", "never", 
			"now", "world", "draw"};	
	
	x.solution(3, w);
}

private void solution(int n, String[] w) {
	// TODO Auto-generated method stub
	String last = "";
	String curr = "";
	String log = "";
	for(int i = 0; i<w.length;i++) {
			
			curr = w[i];
			if(log.contains(curr)) {
				System.out.println("누가 했던거 또함!");
				break;
				}
			if(isRule(last,curr)) {
				System.out.println("누군가가 규칙을 어김! - last:"+last+" curr:"+curr);
				break;
			}
			last = curr;
			log  = log+"_"+last;
			System.out.println(log);
		}
	long k = log.chars().filter(e -> e=='_').count()+1;
	int c = 0;
	for(int i = 0; i<k; i++) {
		System.out.println(c);
		if(c==n) { 
			c = 0;
		}
		c++;
	}
	int A = 0;
	int B = 0;
	for(int i = 0; i<k; i++) {
		System.out.println(A);
		if(A==n) {
			A=0;
		}
		A++;
		if(A==c) {
			B++;
		}
	}
	System.out.println(c+","+B);
}

public boolean isRule(String last,String curr) {
	if(last.length()==0) {
		return false;
	}
	if(last.substring(last.length()-1, last.length())
			.equals(curr.substring(0, 1))) {	
		return false;
	}else {
		return true;
	}
	}
}
