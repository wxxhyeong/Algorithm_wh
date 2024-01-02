// 프로그래머스 땅따먹기
public class study_1106_1 {

    static int[][] arr;
    int solution(int[][] land) {
        int answer = 0;

        //왠지 dp 같더라
        arr = new int[land.length][4];
        for (int i = 0; i < 4; i++) {
            arr[0][i] = land[0][i];
        }

        for (int i = 0; i < 4; i++) {
            dp(land, 1);
        }

        for (int i = 0; i < 4; i++) {
            if(arr[land.length-1][i] > answer)
                answer = arr[land.length - 1][i];
        }


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

    void dp(int[][] land, int n) { // int n = 다음 행, int cur = 현재 열

        if (n >= land.length)
            return;

        // arr[n][i] = arr[n-1]에서 i 가 아닌 곳에서 최댓값 + land[n][i]
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i != j) {
                    if (arr[n - 1][j] + land[n][i] > arr[n][i]) {
                        arr[n][i] = arr[n - 1][j] + land[n][i];
                    }
                }
            }
        }

        dp(land, n + 1);
    }

}
