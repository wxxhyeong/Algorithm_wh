// 프로그래머스 네트워크
public class study_1018_2 {

    static boolean[] visit;
    static int[][] graph;

    public int solution(int n, int[][] computers) {

        graph = new int[n][n];
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (computers[i][j] == 1) {
                    graph[i][j] = j;
                }
            }
        }

        visit = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                dfs(i);
                answer++;
            }
        }

        return answer;
    }

    static void dfs(int start) {
        if (visit[start]){
            return;
        }

        visit[start] = true;
        for (int i : graph[start]) {
            dfs(i);
        }

    }


}
