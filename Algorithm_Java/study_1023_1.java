import java.util.Stack;

public class study_1023_1 {

    public static void main(String[] args) {
        System.out.println(solution("[](){}"));
    }


    static public int solution(String s) {
        int answer = 0;

        Stack<Character> stack;

        for (int i = 0; i < s.length(); i++) {
            s = s.substring(1) + s.charAt(0);
            System.out.println(s+"********");
            stack = new Stack<>();

            char[] strArr = s.toCharArray();
            stack.push(strArr[0]);
            int idx = 1;

            while (idx < s.length()) {
                if (!stack.isEmpty()) {
                    switch (stack.peek()) {
                        case '[':
                            if (strArr[idx] == ']') {
                                stack.pop();
                            } else {
                                stack.push(strArr[idx]);
                            }
                            break;
                        case '{':
                            if (strArr[idx] == '}') {
                                stack.pop();
                            } else {
                                stack.push(strArr[idx]);
                            }
                            break;
                        case '(':
                            if (strArr[idx] == ')') {
                                stack.pop();
                            } else {
                                stack.push(strArr[idx]);
                            }
                    }
                }
                else {
                    stack.push(strArr[idx]);
                }
                idx++;
                System.out.println(stack.toString());

            }

            System.out.println("end = " + stack.toString());

            if (stack.isEmpty()) {
                answer++;
            }


        }



        return answer;
    }
}
