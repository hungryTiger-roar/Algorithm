aList = []
bList = []

N,M = map(int,input().split())

for _ in range(N):
    A = input().split()
    aList.append(A)
for _ in range(N):
    B = input().split()
    bList.append(B)


for n in range(N):
    result = ''
    for m in range(M):
        result += str(int(aList[n][m])+int(bList[n][m]))+' '
        
    print(result)