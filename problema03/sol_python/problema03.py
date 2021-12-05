extra1 = 1.5
extra2 = 2
extra3 = 2.5
extra4 = 3

nombre = (input("Ingrese su nombre: "))
tipoEmpleado = int(input("Ingrese tipo de empleado: "))
horastrabajadas = int(input("Ingrese las horas trabajadas: "))
cuotaHora = int(input("Ingrese el valor de la cuota por hora: "))

pagoparcial = (cuotaHora * horastrabajadas)
horasextra = (horastrabajadas - 40)


cuotaextra1 = (horasextra * extra1)
cuotaextra2 = (horasextra * extra2)
cuotaextra3 = (horasextra * extra3)
cuotaextra4 = (horasextra * extra4)

print("\n\nCálculo de sueldo\n" "Horas trabajadas: ", horastrabajadas,"\n" + "Cuota por hora: ", cuotaHora,"\n"+ "Sueldo parcial: ", pagoparcial)

if (horastrabajadas <= 40):
    print("La cantidad de horas trabajadas no son suficientes para hacer pago de horas extra")
    print("El sueldo a pagar es: ", pagoparcial)

if (tipoEmpleado == 1):
    sueldo = pagoparcial + cuotaextra1
    print("Valor a pagar por horas extra: ", cuotaextra1)

if (tipoEmpleado == 2):
    sueldo = pagoparcial + cuotaextra2
    print("Valor a pagar por horas extra: ", cuotaextra2)

if (tipoEmpleado == 3):
    sueldo = pagoparcial + cuotaextra3
    print("Valor a pagar por horas extra: ", cuotaextra3)

if (tipoEmpleado == 4):
    sueldo = pagoparcial + cuotaextra4
    print("Valor a pagar por horas extra: ", cuotaextra4)
    print("El sueldo a pagar es: ", sueldo)
