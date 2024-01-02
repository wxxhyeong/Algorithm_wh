import java.util.ArrayList;

public class nc_Solution1 {
    public static void main(String[] args) {

    }


    public int[][] solution(int n, int m, int[] fold, int[][] cut) {
        ArrayList<int[]> cutcut = new ArrayList<>();
        int[][] answer = new int[n][m];

        for (int[] ints : cut) {
            cutcut.add(ints);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer[i][j] = 1;
            }
        }


        int cnt_n = 0;
        int cnt_m = 0;  //세로접기 횟수, 가로접기 횟수
        for (int i : fold) {
            if (i == -1) { //세로접기이면
                cnt_n++;
            } else {
                cnt_m++;
            }
        }

        int temp_n = (int)(n/(Math.pow(2,cnt_n))); //접히고 나서 가로세로길이
        int temp_m = (int)(m/(Math.pow(2,cnt_m)));

        for (int i = 0; i < cnt_n; i++) { //세로 접기

            for (int[] c : cutcut) {
                if (c[0] < temp_n && c[1] < temp_m) {
                    int a = 2*temp_n - (c[0]-1);
                    int b = c[1];
                    int arr[] = {a,b};
                    cutcut.add(arr);
                }
            }
            temp_n *= 2;
        }

        for (int i = 0; i < cnt_m; i++) { //세로 접기

            for (int[] c : cutcut) {
                if (c[1] < temp_m && c[0] < temp_n) {
                    int a = 2*temp_m - (c[1]-1);
                    int b = c[0];
                    int arr[] = {b,a};
                    cutcut.add(arr);
                }
            }
            temp_m *= 2;
        }

        for (int[] c : cutcut) {
            answer[c[0]-1][c[1]-1] = 0;
        }


        return answer;
    }
}
