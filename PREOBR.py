# объявление функции
def convert_to_python_case(text):
    result = txt[0].lower()
    for i in range (1, len(text)):
        if txt[i].isupper() == True:
            result += "_"+ txt[i].lower()
        else:
            result += txt[i]
    return result

# считываем данные
txt = input()

# вызываем функцию
print(convert_to_python_case(txt))