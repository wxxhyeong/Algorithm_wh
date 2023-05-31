n, m = map(int, input().split())
lessons = list(map(int, input().split()))
start = max(lessons)
end = sum(lessons)

result = 10e9


def bs(start, end):

    global result
    #print("start = {}, end = {}".format(start, end))
    if start > end:
        return
    mid = (start+end) // 2
    sum = 0
    cnt = 0

    for i in lessons:
        if sum + i > mid:
            cnt += 1
            sum = i
            continue
        sum += i

    cnt += 1

    if cnt > m:
        #print("cnt > m")
        bs(mid+1, end)
    elif cnt < m:
        if result > mid:
            result = mid
        bs(start, mid -1)

bs(start, end)
print(result)


