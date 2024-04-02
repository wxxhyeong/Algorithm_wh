import java.util.*;
import java.io.*;

class boj1753 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());
        int start = Integer.parseInt(br.readLine());

        boolean[] visited = new boolean[n+1];
        int[] distance = new int[n+1];

        ArrayList<Edge>[] graph = new ArrayList[n+1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }


        for (int i = 0; i < m; i++) {
            stk = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(stk.nextToken());
            int v = Integer.parseInt(stk.nextToken());
            int w = Integer.parseInt(stk.nextToken());

            graph[u].add(new Edge(v, w));
        }

        for (int i = 1; i < n+1; i++) {
            distance[i] = Integer.MAX_VALUE;
        }


        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        distance[start] = 0;

        while(!queue.isEmpty()) {
            int now = queue.poll();

            if (!visited[now]) {
                visited[now] = true;

                for (Edge node : graph[now]) {
                    int next = node.v;
                    int edge = node.w;

                    if (distance[next] > distance[start] + edge) {
                        distance[next] = distance[start] + edge;
                        queue.add(next);
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (distance[i] == Integer.MAX_VALUE)
                System.out.println("INF");
            else
                System.out.println(distance[i]);
        }
    }
}

class Edge {
    int v;
    int w;

    public Edge(int v, int w) {
        this.v = v;
        this.w = w;
    }
}

