from math import sqrt
# объявление функции
def solve(a, b, c):
    D = (b**2) - 4 * a * c    
    e = (-b - (sqrt(D))) / (2 * a)
    f = (-b + (sqrt(D))) / (2 * a)
    return min(e, f), max(e, f)

# считываем данные
a, b, c = int(input()), int(input()), int(input())

# вызываем функцию
x1, x2 = solve(a, b, c)
print(x1, x2)