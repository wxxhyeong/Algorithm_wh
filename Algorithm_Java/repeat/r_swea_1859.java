package repeat;

import java.io.*;
import java.util.StringTokenizer;

public class r_swea_1859 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i < t + 1; i++) {
            int n = Integer.parseInt(br.readLine());

            int[] arr = new int[n];
            StringTokenizer stk = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(stk.nextToken());
            }

            int max = arr[n-1];
            int sum = 0;
            for (int j = n-2; j >= 0; j--) {
                if (max > arr[j]) {
                    sum += max - arr[j];
                }

                else {
                    max = arr[j];
                }
            }

           bw.write("#"+i+" "+sum+"\n");


        }

        bw.flush();
        bw.close();
    }
}
