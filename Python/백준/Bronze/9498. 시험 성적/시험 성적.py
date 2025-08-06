inputScore = input()
scoreInt = int(inputScore)

if scoreInt >= 90:
    print('A')
if 80 <= scoreInt < 90:
    print('B')
if 70 <= scoreInt < 80:
    print('C')
if 60 <= scoreInt < 70:
    print('D')
if scoreInt < 60:
    print('F')