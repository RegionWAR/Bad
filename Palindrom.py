# объявление функции
def is_palindrome(text):
    obshii = []
    obshii_chist = []
    for i in range(len(text)):
        obshii += list(text[i])
    for i in range(len(obshii)):
        if obshii[i] == "." or obshii[i] == "," or obshii[i] == "-" or obshii[i] == "!" or obshii[i] == "?":
            continue
        else:
            obshii_chist.append(obshii[i])
    if obshii_chist == obshii_chist[::-1]:
        return True
    else:
        return False

# считываем данные
txt = input().lower().split()

# вызываем функцию
print(is_palindrome(txt))


# # объявление функции
# def is_palindrome(text):
#     text = [i.lower() for i in text if i not in (',.!?- ')]
#     return text == text[::-1]

# # считываем данные
# txt = input()

# # вызываем функцию
# print(is_palindrome(txt))