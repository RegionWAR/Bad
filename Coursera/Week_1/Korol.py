a, b, c, d = int(input()), int(input()), int(input()), int(input())
if (a + 1 == c or a - 1 == c or a == c):
    if (b + 1 == d or b - 1 == d or b == d):
        print("YES")
    else:
        print("NO")
else:
    print("NO")
