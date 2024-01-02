public class study_1102_1 {
    public int solution(String name) {

        char[] abc = name.toCharArray();
        int answer = 0;

        char cur = 'A';

        for (char c : abc) {
            int updown = Math.abs(c - cur);
            int leftright = moveLeftRight(c, cur);
            answer += Math.min(updown, leftright);
            System.out.println("answer = " + answer);
            cur = c;
            System.out.println("current = " + cur);
        }

        return answer;
    }

    static int moveLeftRight(char c, char cur) {

        return Math.min(c - 'A' + 1, 'Z' - c + 1);
    }
}
