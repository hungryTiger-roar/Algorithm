N,X = map(int,input().split())
listN = list(map(int, input().split()))
for i in range(N):
    if listN[i] < X:
        print(listN[i], end = ' ')