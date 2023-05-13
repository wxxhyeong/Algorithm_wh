import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2018{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int start = 1;
        int end = 1;
        int sum = 0;
        int result = 1;

        while (end <= n) {
            if (sum < n) {
                sum += end;
                end++;
            }
            else if (sum > n) {
                sum -= start;
                start++;
            }
            else {
                result++;
                sum += end;
                end++;
            }
        }

        System.out.println(result);
    }
}