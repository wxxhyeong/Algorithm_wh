import sys
sys.setrecursionlimit(10**7)

n, m = map(int, input().split())

graph = [[] for i in range(n+1)]
visited = [False] * (n+1)
result = 0

for i in range(m):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)


def dfs(graph, start, visited):
    visited[start] = True
    for i in graph[start]:
        if not visited[i]:
            dfs(graph, i, visited)

for i in range(1,n+1):
    if not visited[i]:
        dfs(graph, i, visited)
        result += 1

print(result)


