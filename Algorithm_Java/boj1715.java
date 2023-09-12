import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class boj1715 {
    public static void main(String[] args) throws IOException {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        int sum = 0;
        while (pq.size() != 1) {
            int a = pq.poll();
            int b = pq.poll();

            sum += a + b;
            pq.add(a + b);
        }


        System.out.println(sum);
    }
}
