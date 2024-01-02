import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class nexto_4 {
    public static void main(String[] args) {


    }

    public static String reachTheEnd(List<String> grid, int maxTime) {

        int n = grid.size();
        int m = grid.get(0).length();
        int[][] graph = new int[grid.size()][grid.get(0).length()];
        int start = 0;
        int end = 0;

        for (int i = 0; i < grid.size(); i++) {
            char[] temp = grid.get(i).toCharArray();
            for (int j = 0; j < m; j++) {
                if (temp[j] == '#')
                    graph[i][j] = 0;
                else
                    graph[i][j] = 1;
            }
        }


        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});

        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m)
                    continue;
                if (graph[nx][ny] == 1) {
                    queue.add(new int[]{nx, ny});
                    graph[nx][ny] = graph[x][y] + 1;
                    start = nx;
                    end = ny;
                }
            }

        }
        if (graph[n-1][m-1] >= maxTime && start == n-1 && end == m-1)
            return "Yes";
        else
            return "No";
    }
}
