T = int(input())

for test_case in range(1, T+1):
    n = int(input()) # 발사대의 수
    x = []
    f = []

    for i in range(n):
        a, b = map(int,input().split())
        x.append(a)
        f.append(b)

    cnt = 1
    cur = x[0] + f[0]

    for i in range(1, n):
        if cur >= x[i]:
            continue
        else:
            cur = x[i] + f[i]
            cnt += 1

    print("#{} {}".format(test_case, cnt))