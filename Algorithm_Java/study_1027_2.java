import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

// 프로그래머스 표 편집
public class study_1027_2 {

    public String solution(int n, int k, String[] cmd) {
        String answer = "";
        int current = k;
        StringTokenizer stk;
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            arr.add(i);
        }

        for (String s : cmd) {
            stk = new StringTokenizer(s);
            String command = stk.nextToken();

            switch (command) {
                case "D":
                    current += Integer.parseInt(stk.nextToken());
                    break;
                case "U":
                    current -= Integer.parseInt(stk.nextToken());
                    break;
                case "C":
                    stack.push(arr.remove(k));
                    break;
                case "Z":
                    int tmp = stack.pop();
                    arr.add(tmp, tmp);
                    if (tmp < k) {
                        k++;
                    }
            }
        }

        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(idx) == i) {
                answer += "O";
                idx++;
                continue;
            }
            answer += "X";

        }



        return answer;
    }
}
