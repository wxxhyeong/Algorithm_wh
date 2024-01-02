import java.lang.reflect.Array;
import java.util.ArrayList;

// 가장 먼 노드
public class study_1020_1 {

    static ArrayList<Integer>[] graph;
    static boolean[] visit;

    public int solution(int n, int[][] edge) {
        int answer = 0;

        graph = new ArrayList[n + 1];
        visit = new boolean[n + 1];

        // grahp 작성
        for (int[] e : edge) {
            graph[e[0]].add(e[1]);
        }

        //거리가 0인 경우 생각해야되나 생각하기
        // max 거리랑 max 거리를 갖는 노드 개수 구하기
        //bfs 로 풀기

        visit[1] = true;



        return answer;
    }


}
