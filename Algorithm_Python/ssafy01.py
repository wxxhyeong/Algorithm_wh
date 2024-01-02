test = int(input())

for i in range(test):
    n = int(input())
    prices = list(map(int, input().split()))

    prices.sort(reverse=True)

    print(prices)

