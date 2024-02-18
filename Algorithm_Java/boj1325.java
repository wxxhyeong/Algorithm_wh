import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj1325 {

    static ArrayList<Integer>[] arr;
    static int N;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        arr = new ArrayList[N + 1];
        int[] answer = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = new ArrayList<>();
        }


        for (int i = 0; i < M; i++) {
            stk = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(stk.nextToken());
            int B = Integer.parseInt(stk.nextToken());

            arr[B].add(A);
        }

        for (int i = 1; i <= N; i++) {
            answer[i] = bfs(i);
        }

        int maxVal = 0;
        for (int i : answer) {
            maxVal = Math.max(maxVal, i);
        }

        for (int i = 1; i < N + 1; i++) {
            if (answer[i] == maxVal) {
                System.out.print(i + " ");
            }
        }

    }

    // bfs 에서 컴퓨터가 해킹할 수 있는 컴퓨터의 수를 return
    static public int bfs(int idx) {
        Deque<Integer> dq = new LinkedList<>();
        boolean[] visited = new boolean[N + 1];
        int cnt = 0;
        visited[idx] = true;

        dq.add(idx);

        while (!dq.isEmpty()) {
            int a = dq.pollFirst();
            /* if (!visited[a]) {
                visited[a] = true;
                cnt++;
                for (Integer i : arr[a]) {
                    dq.add(i);
                }
            }
             */
            for (Integer i : arr[a]) {
                if(!visited[i]){
                    visited[i] = true;
                    dq.add(i);
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
