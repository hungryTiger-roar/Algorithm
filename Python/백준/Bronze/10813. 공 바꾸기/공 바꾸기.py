N,M = map(int,input().split())
baguniA = [i+1 for i in range(N)] #변경 전 바구니
baguniB = [i+1 for i in range(N)] #변경 후를 표현할 바구니

for _ in range(M):
    i,j = map(int,input().split())
    baguniB[i-1] = baguniA[j-1]
    baguniB[j-1] = baguniA[i-1]
    baguniA = baguniB.copy()

for i in range(N):
    print(baguniB[i], end=' ')