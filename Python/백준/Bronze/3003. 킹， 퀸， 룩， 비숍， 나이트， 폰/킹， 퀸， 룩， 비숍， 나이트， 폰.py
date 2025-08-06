black = [1,1,2,2,2,8]
white = []

white = input().split()

for i in range(6):
    print(black[i]-int(white[i]), end = ' ')