package repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class r1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        Arrays.sort(arr);
        int result = 0;
        for (int k = 0; k < n; k++) {
            int s = 0;
            int e = n-1; // start & end

            while (s < e) {
                if (arr[s] + arr[e] == arr[k]) {
                    if (s != k && e != k) {
                        result++;
                        break;
                    }
                    else if (s == k) {
                        s++;
                    }
                    else if (e == k) {
                        e--;
                    }
                }
                else if (arr[s] + arr[e] > arr[k]) {
                    e--;
                }
                else
                    s++;
            }
        }

        System.out.println(result);


    }
}
