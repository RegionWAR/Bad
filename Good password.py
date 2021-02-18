# объявление функции
def is_password_good(password):
    txtlist = list(txt)
    passok = False
    if len(txtlist)>= 8 and txt.lower() != txt and txt.upper() != txt:
        for i in txtlist:
            for m in range(10):
                if i == str(m):
                    passok = True
    return passok
# считываем данные
txt = input()
# вызываем функцию
print(is_password_good(txt))