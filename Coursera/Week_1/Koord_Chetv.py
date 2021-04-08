x1, y1, x2, y2 = int(input()), int(input()), int(input()), int(input())
a = 0
b = 0
if x1 > 0 and y1 > 0:
    a = 1
elif x1 < 0 and y1 > 0:
    a = 2
elif x1 < 0 and y1 < 0:
    a = 3
elif x1 > 0 and y1 < 0:
    a = 4
if x2 > 0 and y2 > 0:
    b = 1
elif x2 < 0 and y2 > 0:
    b = 2
elif x2 < 0 and y2 < 0:
    b = 3
elif x2 > 0 and y2 < 0:
    b = 4
if a == b:
    print('YES')
else:
    print('NO')
