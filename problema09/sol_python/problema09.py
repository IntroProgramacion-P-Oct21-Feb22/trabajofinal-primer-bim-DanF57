simbolo = " "
resta = "-"
suma = "+"
cadena = " "
numeroInicial = 12
numero2 = 11
lim2 = 44

while numero2 <= lim2 or numeroInicial <= lim2:
    if numeroInicial % 12 == 0:
        simbolo = suma
    else:
        if numero2 == 11 or numero2 % 11 == 0:
            simbolo = resta

    print("%s%s%d %s%d" % (cadena, suma, numeroInicial, resta, numero2), end="")
    numeroInicial = numeroInicial + 12
    numero2 = numero2 + 11
