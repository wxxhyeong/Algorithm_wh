import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class study_1113_1_1 {

    static int n;
    static int[][] arr;
    static int[][] students;

    public static void main(String[] args) throws IOException {
        StringTokenizer stk;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1][n + 1];
        students = new int[n * n + 1][5];

        for (int i = 1; i <= n * n; i++) {
            stk = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(stk.nextToken());
            students[i][0] = idx;

            for (int j = 1; j < 5; j++) {
                students[1][j] = Integer.parseInt(stk.nextToken());
            }
        }

        for (int[] student : students) {

            for (int x = 1; x <= n; x++) {
                for (int y = 1; y <= n; y++) {
                    //4 방향 탐색
                        // 인접 확인
                        // 빈칸 확인
                }
            }
        }
    }

    static void dirSearch(int x, int y, int stuNum) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 1 || nx > n || ny < 1 || ny > n)
                continue;

            //인접 확인
            checkNear(nx, ny, stuNum);
            // 빈칸 확인

        }
    }

    static void checkNear(int nx, int ny, int stuNum) {
        for (int i = 1; i < 5; i++) {
            if (students[stuNum][i] == arr[nx][ny]) {

            }
        }
    }
}
