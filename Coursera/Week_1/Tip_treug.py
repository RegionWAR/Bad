a, b, c = int(input()), int(input()), int(input())
if a >= b:
    (a, b) = (b, a)
if b >= c:
    (b, c) = (c, b)
if a >= b:
    (a, b) = (b, a)
if a + b <= c:
    print('impossible')
else:
    if a ** 2 + b ** 2 == c**2:
        print('rectangular')
    elif a ** 2 + b ** 2 > c**2:
        print('acute')
    else:
        print('obtuse')
