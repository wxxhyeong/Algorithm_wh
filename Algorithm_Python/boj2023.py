import math

n = int(input())

primeOne = [2,3,5,7]
def isPrime(num):
    for i in range(2, int(math.sqrt(num))+1):
        if num%i == 0:
            return False
    return True


def dfs(num, k):
    if isPrime(num):
        if k == n-1:
            print(num)
        else:
            for i in range(1,10,2):
                dfs(num*10+i, k+1)



if n == 1:
    for i in primeOne:
        print(i)
else:
    for i in primeOne:
        dfs(i, 0)