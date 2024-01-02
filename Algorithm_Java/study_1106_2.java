import java.util.*;
public class study_1106_2 {

    static int[][] arr;
    public int[] solution(int n) {

        int[] answer = {};
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        arr = new int[n][n];
        arr[0][0] = 1;

        for (int i = 0; i < n; i++) {
            arrayList.add(new ArrayList<>());
        }

        snailDown(1, n, 0);

        return answer;
    }

    // 내려가기, 왼쪽으로 가기, 올라가기 3개 함수를 짜야하나 흠
    //
    void snailDown(int start, int end, int low) {
        for (int i = start; i < end; i++) {
            arr[i][low] = arr[i-1][low] + 1;
        }
    }

    void snailRight(int start, int end, int col) {
        for (int i = start; i < end; i++) {

        }
    }


}
