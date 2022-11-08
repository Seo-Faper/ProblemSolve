import java.util.HashMap;
import java.util.stream.Stream;

public class Example3 {
	public static String solution(String[] participant, String[] completion) {
        String answer = "";

//        String[] list = (String[])Stream.of(participant).sorted().toArray();
//        String[] lst = (String[])Stream.of(completion).sorted().toArray();
        int i = 0;
        Stream.of(participant).sorted().forEach(e -> System.out.print(e));
        System.out.println("");
        Stream.of(completion).sorted().forEach(e -> System.out.print(e));
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"leo","leo", "kiki", "eden"};
		String[] b = {"leo","kiki","eden"};
		solution(a, b);
		
	}

}
