import java.util.*;

public class Progms_KAKAO_1{
    public static String solution(int n, int k, String[] cmd) {
        LinkedList<String> exel = new LinkedList<String>();
        Stack<Integer> delLog = new Stack<Integer>();
        for(int i = 0; i<n; i++){
            exel.add("O");
        }
        for(int i = 0; i<cmd.length; i++){
            String command = cmd[i].split(" ")[0];
            if(command.equals("D")) k += Integer.parseInt(cmd[i].split(" ")[1]);
            else if(command.equals("U")) k -= Integer.parseInt(cmd[i].split(" ")[1]);
            else if(command.equals("C")){
                delLog.push(k);
                exel.remove(k);
                if (k == (exel.size())){
                    k--;
                  //  System.out.println("k가 마지막 원소였음 "+exel.toString());
                } 
                
            }
            else if(command.equals("Z")){
                int index = delLog.pop();
                if(index <= k) k++;
                exel.add(index,"O");
            }
            System.out.println(cmd[i]+" k : "+k);
            System.out.println(exel.toString());
            System.out.println(delLog.toString());
        }
        int t = delLog.size();
        for(int i = 0; i<t; i++) exel.add(delLog.pop(),"X");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<exel.size(); i++) sb.append(exel.get(i));
        String answer =new String(sb);
        return answer;
    }
    public static void main(String[] args) {
        int n = 8;
        int	k = 2;	
        String[] cmd = {"D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z", "U 1", "C"};
        System.out.println(solution(n, k, cmd));
    }
}