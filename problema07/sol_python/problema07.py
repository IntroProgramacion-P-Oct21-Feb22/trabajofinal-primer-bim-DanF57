bandera=True
suma=0
while bandera:
    numero=int(input("Ingrese un número: "))

    if numero%2==0:
        suma = suma + numero

    salir=str(input("Ingrese si para salir: "))
    if salir==("si"):
        bandera=False
        if numero<2:
            print("ERROR: numero ingresado no valido")
            bandera=False
print("La suma de los números pares ingresados es: ", suma)
