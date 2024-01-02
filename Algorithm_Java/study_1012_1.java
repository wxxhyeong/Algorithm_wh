//프로그래머스 구명보트

import java.util.Arrays;

public class study_1012_1 {

    public int solution(int[] people, int limit) {

        int answer = 0;

        Arrays.sort(people);

        int end = people.length;

        for (int start = 0; start < end; start++) {

            while (start < end) {
                if (people[start] + people[end] <= limit) {
                    answer++;
                }
            }
        }





        return answer;
    }
}
