import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;


// 백준 1138. 한 줄로 서기
public class study_1110_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        LinkedList<Integer> llist = new LinkedList<>();

        StringTokenizer stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                llist.addFirst(i+1);
                continue;
            }
            llist.add(arr[i], i + 1);

        }

        for (Integer integer : llist) {
            System.out.print(integer+" ");
        }

    }
}
