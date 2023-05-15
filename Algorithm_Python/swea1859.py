T = int(input())

for test_case in range(1, T+1):

    n = int(input())
    price = list(map(int, input().split()))

    sum = 0
    max = price[n-1] # 마지막 인덱스의 값을 최대값으로 설정하면서 구해나간다.

    for i in range(n-2, -1, -1):
        if price[i] < max:
            sum += max-price[i]
        else:
            max = price[i]

    print("#{} {}".format(test_case, sum))