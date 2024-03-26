test = int(input())

i = int(input())

result = ((i // 3) + 1)  * 3


for i in range(test):
    n = int(input())
    prices = list(map(int, input().split()))

    prices.sort(reverse=True)

    print(prices)

