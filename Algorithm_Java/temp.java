import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class temp {

    static ArrayList<Integer>[] arr;
    static int[] answer1;
    static boolean[] visited;
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {





        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        N = Integer.parseInt(stk.nextToken());
        M = Integer.parseInt(stk.nextToken());
        arr = new ArrayList[N + 1];
        answer1 = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = new ArrayList<>();
        }


        for (int i = 0; i < M; i++) {
            stk = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(stk.nextToken());
            int B = Integer.parseInt(stk.nextToken());

            arr[A].add(B);
        }

        for (int i = 1; i <= N; i++) {
            visited = new boolean[N+1];
            bfs(i);
        }

        int maxVal = 0;
        for (int i = 1; i <= N; i++){
            maxVal = Math.max(maxVal, answer1[i]);
        }

        for (int i = 1; i <= N; i++) {
            if (answer1[i] == maxVal) {
                System.out.print(i + " ");
            }
        }

    }

    // bfs 에서 컴퓨터가 해킹할 수 있는 컴퓨터의 수를 return
    static public void bfs(int idx) {
        Queue<Integer> dq = new LinkedList<>();
        dq.add(idx);
        visited[idx] = true;


        while (!dq.isEmpty()) {
            int a = dq.poll();
            for (int i : arr[a]) {
                if(!visited[i]){
                    visited[i] = true;
                    answer1[i]++;
                    dq.add(i);

                }
            }
        }
    }
}
