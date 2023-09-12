import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11047 {
    public static void main(String[] args) throws IOException {
        int n, k;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stk.nextToken());
        k = Integer.parseInt(stk.nextToken());

        int[] coins = new int[n];

        for (int i = n-1; i >= 0; i--) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int coin : coins) {
            count += k/coin;
            k = k%coin;
        }

        System.out.println(count);

    }
}
