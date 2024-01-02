import java.io.*;
import java.util.*;
// 백준 1012. 유기농 배추
public class study_1108_1 {

    static int[][] graph;
    static boolean[][] visited;
    static int[] dx;
    static int[] dy;
    static int m, n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int tt = 0; tt < t; tt++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            m = Integer.parseInt(stk.nextToken());
            n = Integer.parseInt(stk.nextToken());
            int k = Integer.parseInt(stk.nextToken());

            int answer = 0;
            graph = new int[n][m];
            visited = new boolean[n][m];
            ArrayList<int[]> baechues = new ArrayList<>();
            dx = new int[]{-1, 1, 0, 0};
            dy = new int[]{0, 0, -1, 1};

            // x = low, y = col
            for (int i = 0; i < k; i++) {
                stk = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(stk.nextToken());
                int y = Integer.parseInt(stk.nextToken());

                baechues.add(new int[]{y, x});
                graph[y][x] = 1;
            }

            for (int[] baechue : baechues) {
                int x = baechue[1];
                int y = baechue[0];

                if (visited[y][x]) {
                    continue;
                }
                dfs(x, y);
                answer += 1;
            }

            sb.append(answer + "\n");
        }
        System.out.println(sb.toString());
    }


    static void dfs(int x, int y) {
        if (graph[y][x] == 0 || visited[y][x])
            return;

        visited[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < m && ny >= 0 && ny < n)
                dfs(nx, ny);
        }
    }
}
