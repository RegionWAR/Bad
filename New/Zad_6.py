# объявление функции
def is_pangram(text):
    flag = False
    text = text.upper()
    alfavit = ['A', 'E', 'I', 'O', 'U', 'Y', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z']
    for i in range(len(alfavit)):
        if alfavit[i] in text:
            flag = True
        else:
            flag = False
            break
    return flag
# считываем данные
text = input()
# вызываем функцию
print(is_pangram(text))