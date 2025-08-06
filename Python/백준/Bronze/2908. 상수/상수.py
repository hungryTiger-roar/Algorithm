A,B = input().split()

newA = ''
for i in range(len(A)):
    newA += A[-1-i]
newB = ''
for i in range(len(B)):
    newB += B[-1-i]
    
if int(newA) > int(newB):
    print(newA)
else:
    print(newB)