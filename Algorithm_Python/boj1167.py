from collections import deque
n = int(input())
graph = [[] for i in range(n+1)]
for i in range(1, n+1):
    nodes = list(map(int,input().split()))
    idx = nodes[0]
    nodes = nodes[1:-1]
    for j in range(0, len(nodes), 2):
        graph[idx].append((nodes[j], nodes[j+1],))

visited = [False] * (n+1)
distance = [0] * (n+1)
def bfs (start):
    queue = deque([start])
    visited[start] = True
    while queue:
        n = queue.popleft()
        for i in graph[n]:
            if not visited[i[0]]:
                queue.append(i[0])
                distance[i[0]] = distance[n] + i[1]
                visited[i[0]] = True

bfs(1)
max_idx = 0
for i in range(1, n+1):
    if distance[max_idx] < distance[i]:
        max_idx = i

visited = [False] * (n+1)
distance = [0] * (n+1)
bfs(max_idx)
print(max(distance))
