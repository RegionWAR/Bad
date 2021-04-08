a, b, c, d = int(input()), int(input()), int(input()), int(input())
color = (((a + b) % 2) > 0) == (((c + d) % 2) > 0)
if color and d > b and a + (d - b) >= c >= a - (d - b):
    print('YES')
else:
    print('NO')
