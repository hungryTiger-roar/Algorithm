T = int(input())
number = 0
for i in range(T):
    number = number + 1
    A,B = map(int, input().split())
    print(f'Case #{number}: {A+B}')