package repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class r1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }

        int result = 0;

        Arrays.sort(arr);

        int start = 0;
        int end = n-1;

        while (start < end) {
            if (arr[start] + arr[end] > m) {
                end--;
            }
            else if (arr[start] + arr[end] <= m) {
                if (arr[start] + arr[end] == m) {
                    result++;
                }
                start++;
            }
        }
        System.out.println(result);

    }
}
