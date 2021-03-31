a = int(input()) * 100
b = int(input())
cena_v_kop = a + b
c = int(input())
cena = c * cena_v_kop
kop = cena % 100
rub = cena // 100
print(rub, kop)
