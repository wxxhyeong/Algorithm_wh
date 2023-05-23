from collections import deque

n, m = map(int, input().split())
graph = []
visited = [[False]*m for i in range(n)]

for i in range(n):
    graph.append(list(map(int, input())))

queue = deque()
queue.append([0, 0])
visited[0][0] = True

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

while queue:
    v = queue.popleft()
    x = v[0]
    y = v[1]

    if x == n-1 and y == m-1:
        break

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < n and 0 <= ny < m:
            if graph[nx][ny] != 0 and not visited[nx][ny]:
                graph[nx][ny] = graph[x][y] + 1
            #if graph[nx][ny] + graph[x][y]: # 방문하지 않은 곳 노드에 추가
                queue.append([nx, ny])
                visited[nx][ny] = True
    #print(queue)
print(graph[n-1][m-1])
