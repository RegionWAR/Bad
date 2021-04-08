a, b, c = int(input()), int(input()), int(input())
if (c % b == 0 or c % a == 0) and c <= a * b:
    print('YES')
else:
    print('NO')
