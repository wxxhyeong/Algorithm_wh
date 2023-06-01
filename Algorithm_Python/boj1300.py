n = int(input())
k = int(input())

arr = [[i*j for j in range(1, n+1)] for i in range(1, n+1)]
start = 1
end = k # arr의 최대값은 k를 넘어갈 수 없음
# k의 최대값은 N^2 이고, n x n 차원 배열 A의 최대값도 N^2이므로
# k번째 위치한 x의 값은 k를 벗어날 수 없다.

while (start <= end):
    mid = (start + end) // 2
    cnt = 0 # k 이하의 수가 몇 개인지 판단할 변수

    for i in range(1, n + 1):
        cnt += min(mid // i, n)

    if cnt < k:
        start = mid + 1
    else:
        end = mid -1

print(start)

