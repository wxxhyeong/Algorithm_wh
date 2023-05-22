import java.io.*;
import java.util.Stack;

public class boj1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int start = 1;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int cur = Integer.parseInt(br.readLine());

            for (int j = start; j <= cur; j++) {
                stack.push(j);
                sb.append("+\n");
                start = j + 1;

            }

            if (stack.peek() == cur) {
                stack.pop();
                sb.append("-\n");
            }

            else {
                sb = new StringBuilder();
                sb.append("NO");
                break;
            }

        }

        System.out.println(sb.toString());

    }
}
