word = input()
word = word.upper()

alphabet = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']

total = 0
for i in alphabet:
    if word.count(i) > total: #A의 개수가 total(초기값은 0)보다 크면
        total = word.count(i)  #total=>2
        result = i             #result=>A
    elif word.count(i) == total:
        result = '?'
    else:
        pass
        
print(result)