import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj1167 {
    static int n;
    static ArrayList<int[]>[] arr;
    static boolean[] visited;
    static int[] distance;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer stk;
        arr = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = new ArrayList<int[]>();

        }
        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(stk.nextToken()); // 입력받은 노드의 인덱스
            while (true) {
                int node = Integer.parseInt(stk.nextToken());
                if (node == -1)
                    break;
                arr[idx].add(new int[]{node, Integer.parseInt(stk.nextToken())});
            }
        }

        visited = new boolean[n + 1];
        distance = new int[n + 1];

        int max_idx = 1;
        bfs(1);
        for (int i = 1; i <= n; i++) {
            if (distance[i] > distance[max_idx]) {
                max_idx = i;
            }
        }

        visited = new boolean[n + 1];
        distance = new int[n + 1];
        bfs(max_idx);
        Arrays.sort(distance);
        System.out.println(distance[n]);
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int[] ints : arr[node]) {
                int x = ints[0]; // x번 노드
                int d = ints[1]; // x번 노드까지의 이동 거리

                if (visited[x])
                    continue;

                queue.add(x);
                visited[x] = true;
                distance[x] = distance[node] + d;
            }
        }
   }
}