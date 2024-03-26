import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1976 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer stk;

        int graph[][] = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            stk = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                graph[i][j] = Integer.parseInt(stk.nextToken());
            }
        }

        stk = new StringTokenizer(br.readLine());
        int[] cities = new int[m];
        for (int i = 0; i < m; i++) {
            cities[i] = Integer.parseInt(stk.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            int root = i;
            for (int j = 1; j <= n; j++) {
                if (graph[i][j] != 0) {
                    if (i > j) {
                        root = graph[j][i];
                    }
                    graph[i][j] = root;
                }
            }
        }

        /*for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }*/
        Arrays.sort(cities);
        int ans = cities[0];
        for (int city : cities) {
            for (int i : graph[city]) {
                if (i != 0) {
                    if (i != ans){
                        ans = 0;
                        break;
                    }
                }
            }
        }

        if (ans == 0) {
            System.out.println("NO");
        }
        else
            System.out.println("YES");


    }
}
