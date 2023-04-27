import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11659 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        long[] sum = new long[n+1];
        stk = new StringTokenizer(br.readLine());
        for (int i = 1; i < n+1; i++) {
            sum[i] = sum[i - 1] + Integer.parseInt(stk.nextToken());
        }

        for (int i = 0; i < m; i++) {
            stk = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(stk.nextToken())-1;
            int second = Integer.parseInt(stk.nextToken());

            sb.append(sum[second] - sum[first] + "\n");

        }

        System.out.println(sb.toString());


    }
}
