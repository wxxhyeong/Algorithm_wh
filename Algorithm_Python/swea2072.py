T = int(input())

for test_case in range(1,T+1):
    arr = list(map(int, input().split()))
    sum = 0
    for j in arr:
        if j%2 == 1:
            sum += j

    print("#{} {}".format(test_case, sum))

# for test_case in range(1, T + 1):
#     # ///////////////////////////////////////////////////////////////////////////////////
#     numbers = []
#     sum_List = []
#     for i in range(T):
#         numbers.append(list(map(int, input().split(" "))))
#
#     for number in numbers:
#         sum = 0
#         for n in number:
#             if n%2 == 1:
#                 sum += n
#         sum_List.append(sum)
#     idx = 1
#     for s in sum:
#         print("#{} {}".format(idx, s))
#         idx += 1