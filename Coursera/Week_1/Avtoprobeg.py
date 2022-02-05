den_km = int(input())
km = int(input())
print((km // den_km) + ((km % den_km + (den_km - 1)) // den_km))
