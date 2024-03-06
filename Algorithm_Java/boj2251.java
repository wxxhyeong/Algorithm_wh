import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj2251 {

    static int A, B, C;
    static int[] water;
    static boolean[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        A = Integer.parseInt(stk.nextToken());
        B = Integer.parseInt(stk.nextToken());
        C = Integer.parseInt(stk.nextToken());

        water = new int[]{A, B, C};
        answer = new boolean[201];

        bfs();

        for (int i = 0; i < 201; i++) {
            if (answer[i]) {
                System.out.print(i+" ");
            }
        }
    }

    public static void bfs() {
        boolean[][] ab = new boolean[201][201];
        int[][] graph = {{1, 2}, {0, 2}, {0, 1}};

        answer[C] = true;
        ab[0][0] = true;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});

        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int a = node[0];
            int b = node[1];
            int c = C - a - b;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    int[] next = {a, b, c}; // 현재 물상태. 이 물상태를 갖고 물을 이동시키며 판단할 것이기 때문

                    next[i] = next[i] + next[graph[i][j]];
                    next[graph[i][j]] = 0;
                    if (next[i] > water[i]) {
                        next[graph[i][j]] = next[i] - water[i];
                        next[i] = water[i];
                    }

                    if (!ab[next[0]][next[1]]){
                        ab[next[0]][next[1]] = true;
                        queue.add(new int[]{next[0], next[1]});
                        if (next[0] == 0) {
                            answer[next[2]] = true;
                        }

                    }

                }
            }
        }
    }
}