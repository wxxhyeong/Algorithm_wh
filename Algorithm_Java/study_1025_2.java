//// 프로그래머스 경주로 건설
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class study_1025_2 {
//    public int solution(int[][] board) {
//
//        boolean beforeState = true; // true면 내려가는 상태, false면 좌우 상태
//        int n = board.length;
//        int[][] boardState = new int[n][n]; //도로의 직진 1, 코너 2로 상태 구분
//        int[][] boardPrice = new int[n][n]; //도로에 도달하기까지의 가격 작성
//
//        Queue<int[]> queue = new LinkedList<>();
//        queue.add(new int[]{0, 0});
//        boardState[0][0] = 1;
//
//        int[] dx = new int[]{1, -1, 0, 0};
//        int[] dy = new int[]{0, 0, -1, 1};
//
//        while (!queue.isEmpty()) {
//            int[] cur = queue.poll();
//            int x = cur[0];
//            int y = cur[1];
//
//            for (int i = 0; i < 4; i++) {
//                int nx = x + dx[i];
//                int ny = y + dy[i];
//
//                if (nx < 0 || nx >= n || ny < 0 || ny >= n)
//                    continue;
//
//                if (board[nx][ny] == 0) {
//                    if (boardState[x][y] == 1)
//                }
//                /*
//                 1. 벽인지 아닌지 우선 판단
//                 2. 벽이 아니면 이전 상태가 좌우인지, 상하 인지 판단
//                 3.
//                    1) 이전 상태가 좌우인 경우 nx == x 이면 직진 상태 가격 추가, 상태 테이블에 이전과 같은 상태
//                    이전 상태가 좌우인데, nx != x 이면 코너 상태 가격 추가, 상태 테이블에 바뀐 상태 표시
//                        - 1. 새로운 값이 기존 값보다 작을 경우 업데이트 후, 바뀐 좌표 큐에 삽입
//                        - 2. else 이면 종료
//
//                    2) 이전 상태가 상하인 경우 ny == y 이면 직진 상태 가격 추가,
//                    이전 상태가 상하인데, ny != y 이면 코너 상태 가격 추가, 상태 테이블에 바뀐 상태 표시
//                        - 1. 새로운 값이 기존 값보다 작을 경우 업데이트 후, 바뀐 좌표 큐에 삽입
//                        - 2. else 이면 종료
//                 */
//            }
//        }
//
//
//
//
//
//        int answer = 0;
//        return answer;
//    }
//}
