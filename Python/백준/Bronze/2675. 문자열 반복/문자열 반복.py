T = int(input())
P = ''
for _ in range(T):
    test = input()
    R = int(test[0])
    S = test[2:]
    for i in S:
        P = P + (i*R)
    print(P)
    P = ''