import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj1707 {

    static boolean bpg;
    static int[] visited;
    static ArrayList<Integer> graph[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(stk.nextToken());
            int E = Integer.parseInt(stk.nextToken());

            graph = new ArrayList[V + 1];
            for (int i = 0; i <= V; i++) {
                graph[i] = new ArrayList<>();
            }

            for (int i = 0; i < E; i++) {
                stk = new StringTokenizer(br.readLine());
                int v1 = Integer.parseInt(stk.nextToken());
                int v2 = Integer.parseInt(stk.nextToken());

                graph[v1].add(v2);
                graph[v2].add(v1);
            }


            bpg = false;
            visited = new int[V+1];
            for (int i = 1; i <= V; i++) {
                if (visited[i] == 0)
                    bfs(i);

                if (bpg)
                    break;
            }

            if (bpg)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }

    public static void bfs(int idx) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(idx);
        visited[idx] = 1;

        while (!queue.isEmpty()) {
            int val = queue.poll();

            for (Integer i : graph[val]) {
                if (visited[i] == 0) {
                    if (visited[val] == 1)
                        visited[i] = -1;
                    else if (visited[val] == -1)
                        visited[i] = 1;

                    queue.add(i);
                }
                else if (visited[i] == visited[val]) {
                    bpg = true;
                    return;
                }

            }
        }


    }
}
