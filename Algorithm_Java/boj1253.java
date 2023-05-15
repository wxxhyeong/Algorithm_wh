import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        Arrays.sort(arr);

        int result = 0;

        for (int k = 0; k < n; k++) {
            int i = 0;
            int j = n-1;

            while (i < j) {
                if (arr[i] + arr[j] == arr[k]) {
                    if (i != k && j != k) {
                        result++;
                        break;
                    }
                    else if (i == k) {
                        i++;
                    }
                    else if (j == k) {
                        j--;
                    }
                }
                else if (arr[i] + arr[j] < arr[k]) {
                    i++;
                }
                else {
                    j--;
                }
            }
        }
        System.out.println(result);
    }
}
