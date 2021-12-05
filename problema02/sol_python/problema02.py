porcentaje1=20
porcentaje2=25
porcentaje3=40
porcentaje4=50

cantidadTrajes=int(input("Ingrese la cantidad de trajes a comprar: "))
precioUnitario=float(input("Ingrese el precio unitario: "))
#subtotal
subtotal = cantidadTrajes * precioUnitario

if cantidadTrajes <=0:
    print("El valor no es permitido")
if cantidadTrajes == 1:
    descuento=(subtotal*porcentaje1)/100
    precioFinal=subtotal-descuento
    print("El subtotal a pagar es: ",subtotal,"\n"+"El descuento es: ",descuento,"\n"+"El total a pagar es: ",precioFinal,"\n")

if cantidadTrajes == 2:
    descuento=(subtotal*porcentaje2)/100
    precioFinal=subtotal-descuento
    print("El subtotal a pagar es: ",subtotal,"\n"+"El descuento es: ",descuento,"\n"+"El total a pagar es: ",precioFinal,"\n")

if cantidadTrajes == 3:
    descuento=(subtotal*porcentaje3)/100
    precioFinal=subtotal-descuento
    print("El subtotal a pagar es: ",subtotal,"\n"+"El descuento es: ",descuento,"\n"+"El total a pagar es: ",precioFinal,"\n")

if cantidadTrajes > 3:
    descuento=(subtotal*porcentaje4)/100
    precioFinal=subtotal-descuento
    print("El subtotal a pagar es: ",subtotal,"\n"+"El descuento es: ",descuento,"\n"+"El total a pagar es: ",precioFinal,"\n")
