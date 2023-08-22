n, m = map(int, input().split())
numbers = list(map(int, input().split()))

#print(numbers)

s = [0]
for i in numbers:
    s.append(s[-1]+ i)

for i in range(m):
    first, second = map(int, input().split())
    print(s[second] - s[first-1])

