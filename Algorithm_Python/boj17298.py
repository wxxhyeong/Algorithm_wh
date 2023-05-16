n = int(input())
arr = list(map(int, input().split()))
ans = [-1 for i in range(n)]

stack = [] # 수열의 인덱스를 저장하는 스택
stack.append(0) # 첫번째 인덱스 추가
for i in range(1, n):
    while stack and arr[stack[-1]] < arr[i]:
        ans[stack.pop()] = arr[i]
    stack.append(i)
#
# while stack:
#     ans[stack.pop()] = -1

for i in ans:
    print(i,end=" ")