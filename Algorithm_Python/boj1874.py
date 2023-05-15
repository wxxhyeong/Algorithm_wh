n = int(input())
result = []
stack = []
idx = 1
state = True

for i in range(n):
    k = int(input())

    while idx <= k:
        stack.append(idx)
        idx += 1
        result.append("+")
    # for j in range(idx, k+1):
    #     stack.append(j)
    #     result += "+\n"
    #     idx += 1
    if stack[-1] == k:
        stack.pop()
        result.append("-")
    else:
        state = False
        break

if state:
    for i in result:
        print(i)
else:
    print("NO")
