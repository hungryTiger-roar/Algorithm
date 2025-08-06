restList = []
for _ in range(10):
    N = int(input())
    rest = N%42
    restList.append(rest)
restSet = set(restList)

print(len(restSet))