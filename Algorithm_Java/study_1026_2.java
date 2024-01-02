import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

// 숫자 게임
public class study_1026_2 {
    public int solution(int[] A, int[] B) {

        PriorityQueue<Integer> a = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> b = new PriorityQueue<>(Collections.reverseOrder());

        int answer = 0;

        for (int i = 0; i < A.length; i++) {
            a.add(A[i]);
            b.add(B[i]);
        }

        while (!a.isEmpty()) {
            if (b.peek() > a.peek()) {
                answer++;
                b.poll();
                a.poll();
                continue;
            }

            a.poll();
        }



        return answer;
    }
}
