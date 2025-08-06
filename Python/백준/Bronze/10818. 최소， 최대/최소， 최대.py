N = int(input())
listN = list(map(int, input().split()))

big = -1000000
small = 1000000
for i in range(N):
    if listN[i] < small:
        small = listN[i]
    if listN[i] > big:
        big = listN[i]
print(small, big)