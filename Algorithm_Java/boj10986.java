import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        stk = new StringTokenizer(br.readLine());
        int sum = 0;
        int cnt = 0;
        int lastNum = 0;
        for (int i = 0; i < n; i++) {
            lastNum = Integer.parseInt(stk.nextToken());
            sum += lastNum;
        }
    }
}
