// 프로그래머스 이진변환 반복하기
public class study_3 {

    public int[] solution(String s) {
        int[] answer = new int[2];

        while (s != "1") {

            s = removeZero(s, answer);
            binaryConv(Integer.parseInt(s), answer);

        }







        return answer;
    }

    static String removeZero(String msg, int[] ans) {

        StringBuilder sb = new StringBuilder();

        for (char c : msg.toCharArray()) { // max 15만
            if (c == '1') {
                sb.append("1");
                continue;
            }
            ans[1] += 1;
        }

        return sb.toString();
    }

    static String binaryConv(int num, int[] ans) {

        //binary


        return "";
    }

}
