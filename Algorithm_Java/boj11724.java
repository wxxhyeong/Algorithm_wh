import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

class boj11724 {
    static ArrayList<Integer>[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        arr = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        int result = 0;

        for (int i = 1; i < n + 1; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            stk = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(stk.nextToken());
            int v = Integer.parseInt(stk.nextToken());

            arr[u].add(v);
            arr[v].add(u);
        }

        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                dfs(i);
                result++;
            }
        }

        System.out.println(result);
    }


    public static void dfs(int start){
        if (visited[start])
            return;

        visited[start] = true;
        for (Integer integer : arr[start]) {
            if (!visited[integer])
                dfs(integer);
        }
    }
}