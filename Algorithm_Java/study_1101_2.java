// 프로그래머스 불량 사용자
public class study_1101_2 {
    public int solution(String[] user_id, String[] banned_id) {
        int answer = 0;

        String[] regExps = new String[banned_id.length];
        int idx = 0;

        // 정규표현식 생성
        for (String banStr : banned_id) {
            char[] banChar = banStr.toCharArray();
            StringBuilder exp = new StringBuilder("^");

            for (char c : banChar) {
                if (c != '*') {
                    exp.append(c);
                    continue;
                }
                exp.append('.');
            }
            exp.append("$");
            regExps[idx] = exp.toString();
            idx++;
        }

        //bfs or dfs 로 모든 조합 만들기
        boolean[] visitied = new boolean[user_id.length];


        return answer;
    }

    static void dfs() {
        // 1. 제재 아이디 개수만큼 찾아냈으면 return



        // 2. 아니면 새로운 조합 만들기
        // 3. 만든 조합을 hash set에 넣기 (중복이면 hash set 이므로 알아서 한 가지로 처리)
    }

}
