import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj1260 {

    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());
        int v = Integer.parseInt(stk.nextToken());

        arr = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken());
            int y = Integer.parseInt(stk.nextToken());

            arr[x].add(y);
            arr[y].add(x);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(arr[i]);
        }

        dfs(v);
        visited = new boolean[n + 1];
        System.out.println();
        bfs(v);



    }

    static void dfs(int start) {
        visited[start] = true;
        System.out.print(start +" ");
        for (Integer integer : arr[start]) {
            if (!visited[integer]) {
                dfs(integer);
            }
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);
        System.out.print(start +" ");

        while (!queue.isEmpty()) {
            int x = queue.poll();

            for (Integer integer : arr[x]) {
                if (!visited[integer]) {
                    queue.add(integer);
                    visited[integer] = true;
                    System.out.print(integer + " ");
                }
            }
        }
    }


}
