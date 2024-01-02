// 프로그래머스 영어 끝말잇기
import java.util.ArrayList;


public class study_1012_2 {
    public int[] solution(int n, String[] words) {

        int[] answer = new int[2];
        //int loser = 0; // 탈락한 사람 값 % (n+1) = 순서
        int turn = 0; // 탈락한 사람의 몇번째 차례 / (n+1) = 몫이 차례

        ArrayList<String> done = new ArrayList<>();
        done.add(words[0]);
        char before = words[0].charAt(words[0].length()-1);


        for (int i = 1; i < words.length; i++) {
            turn++;
            //loser++;
            if (before == words[i].charAt(words[0].length()-1)) { // 첫문 끝문 체크
                if (done.contains(words[i])) { //중복
                    break;
                }
                done.add(words[i]);
                before = words[i].charAt(words[0].length()-1);
                continue;
            }

            break;
        }
        System.out.printf("turn = %d", turn);
        answer[0] = turn % (n + 1);
        answer[1] = turn / (n + 1);





        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.printf("[%d, %d]", answer[0], answer[1]);

        return answer;
    }
}
