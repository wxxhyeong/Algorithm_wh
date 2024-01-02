import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 백준 1931. 회의실 배정
public class boj1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] rooms = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            rooms[i][0] = Integer.parseInt(stk.nextToken());
            rooms[i][1] = Integer.parseInt(stk.nextToken());
        }

        Arrays.sort(rooms, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int answer = 0;
        int end = -1;

        for (int i = 0; i < n; i++) {
            if (rooms[i][0] >= end){
                end = rooms[i][1];
                answer++;
            }
        }

        System.out.println(answer);

    }

}
