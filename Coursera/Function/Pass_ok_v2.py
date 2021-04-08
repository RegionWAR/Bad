# объявление функции
def is_valid_password(password):
    psv_spis = password.split(":")
    flag = False
    delit = 0
    for i in range(1,int(psv_spis[1])):
        if int(psv_spis[1]) % i == 0:
            delit += 1
    if int(psv_spis[2]) % 2 == 0 and delit == 1 and psv_spis[0] == psv_spis[0][::-1] and len(psv_spis) == 3:
        flag = True
    return flag
# считываем данные
psw = input()
# вызываем функцию
print(is_valid_password(psw))