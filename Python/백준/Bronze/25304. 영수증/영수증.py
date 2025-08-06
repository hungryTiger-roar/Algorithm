X = int(input())
N = int(input())

total = 0
for i in range(N):
    cost, count = map(int, input().split())
    sum = cost*count
    total = total + sum
if total == X:
    print('Yes')
else:
    print('No')