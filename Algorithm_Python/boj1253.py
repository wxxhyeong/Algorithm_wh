n = int(input()) #최소 한개
numbers = list(map(int,input().split()))
numbers.sort()
result = 0

for k in range(len(numbers)):
    i = 0
    j = n-1

    target = numbers[k]

    while (i < j):
        if numbers[i] + numbers[j] == target:
            if i != k and j != k:
                result += 1
                break
            elif i == k:
                i += 1
            elif j == k:
                j -= 1
        elif numbers[i] + numbers[j] < target:
            i += 1
        else:
            j -= 1

print(result)