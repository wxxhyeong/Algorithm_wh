import java.io.*;
import java.util.*;

public class boj18352_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stk.nextToken()); // 도시의 개수
        int M = Integer.parseInt(stk.nextToken()); // 도로의 개수
        int K = Integer.parseInt(stk.nextToken()); // 거리 정보
        int X = Integer.parseInt(stk.nextToken()); // 출발 도시 번호

        ArrayList<Integer>[] arr = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = new ArrayList<>();
        }


        for (int i = 0; i < M; i++) {
            stk = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(stk.nextToken());
            int B = Integer.parseInt(stk.nextToken());

            arr[A].add(B);
        }

        int[] visited = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            visited[i] = -1;
        }

        Deque<Integer> dq = new ArrayDeque<>();

        dq.add(X);
        visited[X]++;
        // X의 연결 노드를 큐에 집어넣었다.

        ArrayList<Integer> answer = new ArrayList<>();

        while (!dq.isEmpty()) {
            int node = dq.poll();

            for (Integer i : arr[node]) {
                if (visited[i] == -1) {
                    visited[i] = visited[node] + 1;
                    dq.add(i);
                }
            }

        }

        for (int i = 1; i <= N; i++) {
            if (visited[i] == K) {
                answer.add(i);
            }
        }

        if (answer.isEmpty())
            System.out.println("-1");
        else {
            Collections.sort(answer);
            for (Integer i : answer) {
                System.out.println(i);
            }
        }

    }
}
