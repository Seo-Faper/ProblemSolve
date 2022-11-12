
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ_10799 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<String> sk = new Stack<String>();
        String k = bf.readLine();
        int ans = 0;
        boolean forward = false;     
        for(int i = 0; i<k.length(); i++){

            if(k.charAt(i) == '('){
                sk.push("(");
                forward = false;
            } 
            else{
                if(forward){
                    sk.pop();
                    ans +=1;
                }else{
                    sk.pop();
                    ans+=sk.size();
                }
                forward = true;

            }  
        }
       bw.write(String.valueOf(ans));
       bf.close();
       bw.close();
    }
}
