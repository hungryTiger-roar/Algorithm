A = int(input())
mod4 = A % 4
mod100 = A % 100
mod400 = A % 400

if (mod4 == 0 and mod100 != 0) or (mod400 == 0):
    print('1')
else:
    print('0')