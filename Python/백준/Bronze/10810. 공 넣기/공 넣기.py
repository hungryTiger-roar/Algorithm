N,M = map(int,input().split())
baguni = [0]*N

for _ in range(M):
    i,j,k = map(int,input().split())
    for r in range(i,j+1):
        baguni[r-1]=k

for x in range(N):
    print(baguni[x], end =' ')