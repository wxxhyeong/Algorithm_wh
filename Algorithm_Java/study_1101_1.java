//프로그래머스 할인행사
import java.util.ArrayList;

public class study_1101_1 {
    static ArrayList<String> wants;
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        init(want, number);

        for (int i = 0; i < discount.length - 9; i++) {
            for (int j = i; j < i + 10; j++) {
                if (!wants.contains(discount[j])) {
                    break;
                }
                wants.remove(discount[j]);
            }
            if (wants.isEmpty()) {
                answer++;
            }

            init(want, number);

        }


        return answer;
    }

    static public void init(String[] want, int[] number) {
        wants = new ArrayList<>();
        for (int i = 0; i < want.length; i++) {
            for (int j = 0; j < number[i]; j++) {
                wants.add(want[i]);
            }
        }
    }
}
