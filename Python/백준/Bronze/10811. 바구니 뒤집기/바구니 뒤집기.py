N,M = map(int, input().split())
baguni = [i+1 for i in range(N)]
for _ in range(M):
    i,j = map(int, input().split())
    temp = baguni[i-1:j]
    temp.reverse()
    baguni = baguni[:i-1]+temp+baguni[j:]

for r in baguni:
    print(r, end=' ')