import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1717 {

    static int[] arr;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        arr = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            arr[i] = i;
        }


        for (int i = 0; i < m; i++) {
            stk = new StringTokenizer(br.readLine());
            int o = Integer.parseInt(stk.nextToken());
            int a = Integer.parseInt(stk.nextToken());
            int b = Integer.parseInt(stk.nextToken());

            if (o == 0) {
                union(a, b);
            }
            else
                if (find(a) == find(b))
                    System.out.println("YES");
                else
                    System.out.println("NO");
        }

    }

    public static void union(int a, int b) {

        a = find(a);
        b = find(b);

        if (a != b) {
            arr[b] = a;
        }

    }

    public static int find(int a) {

        if (arr[a] == a) {
            return a;
        }

        return arr[a] = find(arr[a]);
    }
}
