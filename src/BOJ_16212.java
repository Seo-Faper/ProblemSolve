import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ_16212 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());//정수 입력 받을 때
        int[] arr = new int[n];
        String[] k = bf.readLine().split(" ");
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(k[i]);
        }
        Arrays.sort(arr);
        for(int i = 0; i<n; i++){
            bw.write(String.valueOf(arr[i])+" ");
        }	
        bw.flush();
        bw.close();
    }
}
