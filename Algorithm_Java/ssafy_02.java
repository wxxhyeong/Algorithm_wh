import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.cert.CollectionCertStoreParameters;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

/*
3
6 1 3
4 3 2 3 2 1
6 3 4
1 2 3 4 5 6
6 1 4
10 10 9 10 3 3
 */

public class ssafy_02 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int test = Integer.parseInt(br.readLine());

        for (int t = 0; t < test; t++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(stk.nextToken());
            int A = Integer.parseInt(stk.nextToken()); //최소
            int B = Integer.parseInt(stk.nextToken()); //최대

            LinkedList<Integer> points = new LinkedList<>();
            stk = new StringTokenizer(br.readLine());
            for (int nn = 0; nn < n; nn++) {
                points.add(Integer.parseInt(stk.nextToken()));
            }

            int result = solution(n, A, B, points);
            sb.append("#"+(t+1) +" "+ result + "\n");
        }
        System.out.println(sb.toString());
    }

    static int solution(int N, int A, int B, LinkedList<Integer> points) {
        int answer = A;
        Collections.sort(points); // 맨 앞은 가장 작은 점수, 맨 뒤는 가장 큰 점수, 그룹당 최소 하나는 있어야함
        int min = points.getFirst();
        int max = points.getLast();
        //System.out.println("min = " + min);
       // System.out.println("max = " + max);

        while (points.getFirst() == min) {
            points.removeFirst();
        }

        while (points.getLast() == max) {
            points.removeLast();
        }

        for (int i = A; i >= B; i--) {
            if (points.size() >= A && points.size() <= B) {
                answer = i;
            }

            int mini = points.getFirst();
            int countMin = 0;
            int countMax = 0;
            int maxi = points.getLast();

            for (Integer point : points) {
                if (point == mini) {
                    countMin++;
                } else if (point == maxi) {
                    countMax++;
                }
            }

            if (countMin > countMax){
                for (int k = 0; k < countMax; k++) {
                    points.removeLast();
                }
            }
            else
                for (int k = 0; k < countMin; k++) {
                    points.removeFirst();
                }

        }
        return answer;
    }
}
