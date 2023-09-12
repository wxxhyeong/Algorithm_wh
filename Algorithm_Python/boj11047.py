n, k = map(int, input().split())

coins = []
for i in range(n):
    coins.append(int(input()))

result = 0
for i in reversed(coins):

    v = k//i
    result += v
    k -= v*i

print(result)