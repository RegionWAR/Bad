x, y = int(input()), int(input())
print('YES' if (x - 1) % (y - x + 1) == 0 else "NO")
