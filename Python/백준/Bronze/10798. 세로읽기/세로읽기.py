wordList = []
for _ in range(5):
    word = input()
    wordList.append(word)

result = ''
for i in range(15):
    for r in range(5):
        try:
            result += wordList[r][i]

        except IndexError:
            pass

print(result)