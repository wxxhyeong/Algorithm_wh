import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class boj2343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        int[] arr = new int[n];
        int start = 0;
        int end = 0;
        stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
            if (arr[i] > start) start = arr[i];
            end += arr[i];
        }

        while (start <= end) {
            int mid = (start + end) / 2;
            int sum = 0;
            int cnt = 0;


            for (int i = 0; i < n; i++) {
                sum += arr[i];
                if (sum > mid) {
                    cnt++;
                    sum = arr[i];
                }
            }
            cnt++;

            if (cnt > m) {
                start = mid + 1;
            }
            else
                end = mid - 1;
        }
        System.out.println(start);

    }
}