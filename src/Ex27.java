import java.io.*;
import java.util.StringTokenizer;

public class Ex27 {

    static int N;
    static int S;
    static int cnt = 0;
    static int[] numArr = new int[21];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {

            numArr[i] = Integer.parseInt(st.nextToken());
        }

        solve(0, 0);

        // S�� 0�� ��� �����յ� ���ԵǹǷ� �������� -1�� ���ش�.
        if (S == 0) {
            cnt -= 1;
        }

        System.out.println(cnt);
    }

    static void solve(int sum, int step) {

        if (step == N) {

            if (sum == S) cnt++;
            return;
        }

        solve(sum + numArr[step], step + 1);
        solve(sum, step + 1);
    }
}

