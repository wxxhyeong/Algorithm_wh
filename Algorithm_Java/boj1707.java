import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj1707 {

    static boolean bpg;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(stk.nextToken());
            int E = Integer.parseInt(stk.nextToken());

            ArrayList<Integer> graph[] = new ArrayList[V + 1];
            for (int i = 0; i <= V; i++) {
                graph[i] = new ArrayList<>();
            }

            for (int i = 0; i < E; i++) {
                stk = new StringTokenizer(br.readLine());
                int v1 = Integer.parseInt(stk.nextToken());
                int v2 = Integer.parseInt(stk.nextToken());

                graph[v1].add(v2);
            }

            int[] visited = new int[V + 1];
            bpg = false;

            for (int i = 1; i <= V; i++) {
                bfs(i);

                if (bpg)
                    break;
            }






        }
    }

    public static void bfs(int idx) {

    }
}
