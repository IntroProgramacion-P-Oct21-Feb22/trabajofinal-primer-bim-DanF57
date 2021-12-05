numero1=int(input("Ingrese el primer numero: "))
numero2=int(input("Ingrese el segundo numero: "))
numero3=int(input("Ingrese el tercer numero: "))


if numero1 == numero2 or numero2 == numero3 or numero1 == numero3:
    print("Uno o varios numeros tienen el mismo valor")
else:
    print("El número mayor entre %d, %d y %d es :%d" %(numero1, numero2, numero3, max(numero1, numero2, numero3)))
