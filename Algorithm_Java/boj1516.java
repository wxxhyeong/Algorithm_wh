import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] b = new int[n]; // n개의 건물 짓는 소요시간
        ArrayList<Integer>[] graph = new ArrayList[n];
        StringTokenizer stk;
        int[] indegree = new int[n]; // 위상정렬을 위한 진입 차수 배열

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine());
            int next = Integer.parseInt(stk.nextToken());
            b[i] = next;

            while (next != -1) {
                next = Integer.parseInt(stk.nextToken());
                if (next == -1)
                    break;
                graph[next-1].add(i);
                indegree[i]++;
            }
        }


        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0)
                queue.add(i);
        }

        int[] answer = new int[n]; // 건설하는데 걸리는 시간 정답 배열
        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int next : graph[now]) {
                indegree[next]--;
                answer[next] = Math.max(answer[next], answer[now] + b[now]);

                if (indegree[next] == 0) {
                    queue.add(next);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(b[i] + answer[i]);
        }
    }

}