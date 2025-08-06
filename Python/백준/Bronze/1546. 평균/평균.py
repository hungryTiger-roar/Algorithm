N = int(input())
score = list(map(int,input().split()))
M = max(score)
jojakSum = 0
for i in range(N):
    jojakScore = score[i]/M*100
    jojakSum = jojakSum + jojakScore
print(jojakSum/N)