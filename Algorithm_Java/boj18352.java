import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj18352 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());
        int x = Integer.parseInt(stk.nextToken());


        ArrayList<Integer>[] graph = new ArrayList[n+1];
        // 그래프의 연결 상태
        for (int i = 0; i < m; i++) {
            stk = new StringTokenizer(br.readLine());
            int startNode = Integer.parseInt(stk.nextToken());
            int endNode = Integer.parseInt(stk.nextToken());

            graph[startNode].add(endNode);

        }

        int result = 0;
        int[] visited = new int[n + 1];

        Queue<Integer> queue = new ArrayDeque<>();

        for (Integer integer : graph[x]) {
            queue.add(integer);
        }

        while (!queue.isEmpty()) {

        }

        
    }


}
