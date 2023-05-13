import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        Arrays.sort(arr);
        int start = 0;
        int end = 1;
        int result = 0;
        int sum = arr[start];

        if (n == 1) {
            System.out.println(0);
        }
        else {
            //System.out.println("들어옴");
            while (start < n-1) {
                //System.out.println("start = " + start +'\t'+"end = " + end);
                //System.out.println("start = " + start);
                if (arr[start] + arr[end] < m) {
                    end++;
                    if (end == n) {
                        start++;
                        end = start+1;
                    }
                }
                else if (arr[start] + arr[end] > m) {
                    start++;
                    end = start+1;
                }
                else {
                    result++;
                    start++;
                    end = start+ 1;
                }
            }
            System.out.println(result);
        }
    }
}
