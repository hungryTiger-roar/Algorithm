rating = ['A+','A0','B+','B0','C+','C0','D+','D0','F','P']
numRating = [4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0]

sum1 = 0
sum2 = 0

for _ in range(20):
    inputScore = input().split()
    
    indexNum = rating.index(inputScore[2])
    sum1 += float(inputScore[1])*numRating[indexNum]
    if inputScore[2] != 'P':
        sum2 += float(inputScore[1])

print(f'{round(sum1/sum2,6):.6f}')