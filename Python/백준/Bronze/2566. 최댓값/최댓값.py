ryulBigNum = []
ryulIndex = []
for _ in range(9):
    num = list(map(int,input().split()))
    ryulBigNum.append(max(num))
    ryulIndex.append(num.index(max(num)))


print(max(ryulBigNum))
haeng = ryulBigNum.index(max(ryulBigNum))
ryul = ryulIndex[ryulBigNum.index(max(ryulBigNum))]
print(f'{haeng+1} {ryul+1}')