import java.util.*;
import java.io.*;
// 백준 21608. 상어초등학교
public class study_1113_1 {

    //

    public static void main(String[] args) throws IOException {
        StringTokenizer stk;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n + 1][n + 1];
        int[][] students = new int[n * n + 1][5];

        for (int i = 1; i <= n * n; i++) {
            stk = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(stk.nextToken());
            students[i][0] = idx;

            for (int j = 1; j < 5; j++) {
                students[1][j] = Integer.parseInt(stk.nextToken());
            }
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        int[] coor = new int[2];

        for (int i = 1; i < n * n; i++) { //학생 수 반복

            int maxSat = 0; //인접한 친구수
            int maxEmpty = 0; //인접한 빈칸
            for (int a = 1; a <= n; a++) { // a, b 는 좌표
                for (int b = 1; b <= n; b++) {

                    int tmpSat = 0;
                    int tmpEmpty = 0;

                    for (int k = 0; k < 4; k++) { // 인접한 4방향 점검

                        int nx = a + dx[k];
                        int ny = b + dy[k];

                        if (nx < 1 || nx > n || ny < 1 || ny > n)
                            continue;
                        
                        // 인접 확인
                        for (int c = 1; c < 5; c++){
                            if (arr[nx][ny] == students[i][c]) {
                                tmpSat += 1;
                            }
                        }

                        if (arr[nx][ny] == 0) {
                            tmpEmpty += 1;
                        }
                    }
                    System.out.println("tmpEmpty = " + tmpEmpty);

                    if (tmpSat > maxSat) {
                        System.out.println("---sat");
                        maxSat = tmpSat;
                        arr[a][b] = 99;
                    }
                    else if (tmpEmpty > maxEmpty) {
                        System.out.println("---empty");
                        maxEmpty = tmpEmpty;

                        coor[0] = a;
                        coor[1] = b;
                    }
                }
            }

            System.out.println("maxEmpty = " + maxEmpty);
            System.out.println("maxSat = " + maxSat);

            for (int z = 1; z <= n; z++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(arr[z][j] +" ");
                }
                System.out.println();
            }
        }

    }
}
