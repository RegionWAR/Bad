# sec = int(input())
# chas = ((sec // 60) // 60)
# minut = (sec // 60) - chas * 60
# if minut < 10:
#     minut = '0' + str(minut)
# secun = sec - (chas * 60 * 60 + ((sec // 60) - chas * 60) * 60)
# if secun < 10:
#     secun = '0' + str(secun)
# print(chas, ':', minut, ':', secun, sep='')
sec = int(input())
print(sec // 3600 % 24, ':', sep='', end='')
print((sec // 60 % 60) // 10, (sec // 60 % 60) % 10, ':', sep='', end='')
print((sec % 3600 % 60) // 10, (sec % 3600 % 60) % 10, sep='')
