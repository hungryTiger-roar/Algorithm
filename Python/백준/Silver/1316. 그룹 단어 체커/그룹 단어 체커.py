N = int(input())

cnt = 0
for _ in range(N):
    word = input()
    wordList = []
    wordList.append(word[0]) #첫번째 글자 리스트에 추가
    for i in range(len(word)-1): 
        if word[i] != word[i+1]: #연속해서 나타나는 문자들을 하나씩만 리스트에 넣기위함
            wordList.append(word[i+1])
    wordSet = set(wordList) #중복을 없애는 set
    if len(wordList) == len(wordSet): #list와 set의 길이가 같은경우는 그룹단어
        cnt += 1
print(cnt)