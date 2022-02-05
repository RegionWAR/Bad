# объявление функции
def is_one_away(word1, word2):
    raz = 0
    if len(word1) == len(word2):
        for i in range(len(word1)):
            if word1[i] != word2[i]:
                raz += 1
    if raz == 1:
        return True
    else: 
        return False

# считываем данные
txt1 = list(input())
txt2 = list(input())

# вызываем функцию
print(is_one_away(txt1, txt2))