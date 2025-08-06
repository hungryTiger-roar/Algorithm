word = input()
result = 0
for i in range(len(word)):
    if word[i] != word[-(i+1)]:
        result = result + 1
    else:
        pass
if result == 0:
    print(1)
else:
    print(0)