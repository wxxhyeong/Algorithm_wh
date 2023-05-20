from collections import deque

n, e, s = map(int,input().split())
graph = [[] for i in range(n+1)]
for i in range(e):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)

dfs_visited = [False] * (n+1)
bfs_visited = [False] * (n+1)

def dfs(u):
    dfs_visited[u] = True
    print("{}".format(u), end=" ")

    for i in graph[u]:
        if not dfs_visited[i]:
            dfs(i)

def bfs(u):
    bfs_visited[u] = True
    print("{}".format(u), end=" ")

    queue = deque([u])

    while queue:
        idx = queue.popleft()

        for i in graph[idx]:
            if not bfs_visited[i]:
                queue.append(i)
                bfs_visited[i] = True
                print("{}".format(i), end=" ")


for i in graph:
    i.sort()

dfs(s)
print()
bfs(s)
