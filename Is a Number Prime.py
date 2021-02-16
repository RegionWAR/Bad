# объявление функции
def is_prime(num):
    delit = 0
    for i in range(1, num//2 + 1):
        if num % i == 0:
            delit += 1
    if delit == 1:
        return True
    else:
        return False
# считываем данные
n = int(input())
# вызываем функцию
print(is_prime(n))