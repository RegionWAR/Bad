n = int(input())
if 10 < n < 20 or n % 10 == 0 or 4 < n % 10 < 10:
    print(n, 'korov')
elif n % 10 == 1:
    print(n, 'korova')
else:
    print(n, 'korovy')
