# объявление функции
def is_correct_bracket(text):
    summ = 0
    for i in text:
        if i == "(":
            summ += 1
        elif i == ")":
            summ -= 1
        if summ < 0:
            break
    if summ == 0:
        return True
    else:
        return False

# считываем данные
txt = input()

# вызываем функцию
print(is_correct_bracket(txt))