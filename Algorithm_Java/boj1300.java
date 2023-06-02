import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        int[][] arr = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = i*j;
            }
        }

        /* 구해야하는 것! arr을 오름차순으로 정렬하였을 때 k번째 수를 구하시오,
        이차원 배열 arr을 오름차순 1차원 배열로 만들면 100,000 x 100,000번의 연산으로
        시간 초과가 발생한다.
        arr에서 k번째 수를 찾아야한다. 오름차순으로 k번째는 곧 arr[k]보다 작거나 같은 수가
        k개 존재한다는 것이다.
        그래서 임의의 x를 두고 x이하의 수가 몇개인지 세가면 된다.
        x이하의 수가 몇개인지는 어떻게 구하면 될까?
        arr을 살펴보면 값들이 구구단처럼 나열되어 있다.
        임의의 x를 n단으로 나누어 각 단마다 x이하의 수가 몇개인지 파악할 수 있다.
        나온 개수를 기반으로 x의 값을 줄이거나 키우는 이진탐색을 적용하여 값을 찾아나갈 수 있다.
         */
        int start = 1;
        int end = k; // 끝 값이 배열의 가장 마지막 값인 n x n이 아닌 이유는 n x n 의 범위가 k보다 항상 작거나 같기 때문이다.
        while (start <= end) {
            int x = (start + end) / 2;
            int cnt = 0;

            for (int i = 1; i <= n; i++) {
                cnt += Math.min(x / i, n);
            }

            if (cnt < k) {
                start = x + 1;
            }
            else
                end = x - 1;
        }

        System.out.println(start);



    }
}
