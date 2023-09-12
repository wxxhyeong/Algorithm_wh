package repeat;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class r2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int first = 1;
        int second = first + 1;
        int sum = first;
        int result = 0;

        if (sum == n) {
            System.out.println(1);
            return;
        }
        while (first <= n) {
            if (sum < n) {
                sum += second;
                second++;
            }
            else {
                if (sum == n) {

                    result++;
                }
                sum -= first;
                first++;
            }
        }

        System.out.println(result);
    }
}
