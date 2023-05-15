import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea1859 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t < T + 1; t++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer stk = new StringTokenizer(br.readLine());

            int[] price = new int[n];
            for (int i = 0; i < n; i++) {
                price[i] = Integer.parseInt(stk.nextToken());
            }

            int maxPrice = price[n - 1];
            long sum = 0;

            for (int i = n - 2; i >= 0; i--) {
                if (price[i] < maxPrice) {
                    sum += maxPrice - price[i];
                }
                else {
                    maxPrice = price[i];
                }
            }

            System.out.printf("#%d %d\n",t,sum);
        }
    }
}
