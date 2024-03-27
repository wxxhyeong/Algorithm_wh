import java.util.*;
import java.io.*;

class boj1948 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 도시 수
        int m = Integer.parseInt(br.readLine()); // 도로 수

        StringTokenizer stk;
        ArrayList<Node> graph[] = new ArrayList[n + 1];
        ArrayList<Node> reverse[] = new ArrayList[n + 1];
         int[] indegree = new int[n+1];

        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
            reverse[i] = new ArrayList<>();
        }


        for (int i = 0; i < m; i++) {
            stk = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(stk.nextToken());
            int end = Integer.parseInt(stk.nextToken());
            int edge = Integer.parseInt(stk.nextToken());
            Node node = new Node(end, edge);

            graph[start].add(node);
            reverse[end].add(new Node(start, edge));
            indegree[end]++;
        }

        stk = new StringTokenizer(br.readLine());
        int startCity = Integer.parseInt(stk.nextToken());
        int endCity = Integer.parseInt(stk.nextToken());


        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startCity);

        int[] time = new int[n+1];
        //int[] way = new int[n+1];
        while(!queue.isEmpty()) {
            int start = queue.poll();

            for (Node dist : graph[start]) {
                indegree[dist.target]--;

                if (time[dist.target] < time[start] + dist.edge) {
                    time[dist.target] = time[start] + dist.edge;
                    //way[dist.target] = way[start] + 1;
                }
                /*else if (time[dist.target] == time[start] + dist.edge) {
                    way[dist.target] += way[start] + 1;
                }*/

                if (indegree[dist.target] == 0) {
                    queue.offer(dist.target);
                }
            }

        }

        queue = new LinkedList<>();
        queue.add(endCity);
        boolean[] visited = new boolean[n + 1];
        int cnt = 0;
        visited[endCity] = true;

        while (!queue.isEmpty()) {
            int end = queue.poll();

            for (Node node : reverse[end]) {

                if (time[node.target] + node.edge == time[end]) {
                    cnt++;
                    if (!visited[node.target]) {
                        visited[node.target] = true;
                        queue.offer(node.target);
                    }

                }
            }



        }


        /*for (int i = 1; i <= n; i++) {
            System.out.print(time[i] + " ");
        }
        System.out.println();*/

        System.out.println(time[endCity]);
        System.out.println(cnt);
        //System.out.println(way[endCity]);


    }
}

class Node {

    int target;
    int edge;

    public Node(int a, int b) {
        this.target = a;
        this.edge = b;
    }

}