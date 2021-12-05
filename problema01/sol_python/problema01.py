angulo1=int(input("Ingrese el primer ángulo: "))
angulo2=int(input("Ingrese el segundo ángulo: "))
angulo3=int(input("Ingrese el tercer ángulo: "))

if angulo1 == 90 or angulo2 == 90 or angulo3==90:
    print("El tipo de triángulo es: Rectángulo")

if (angulo1 > 90 and angulo1 < 180) or (angulo2 > 90 and angulo2 < 180) or (angulo3>90 and angulo3<180):
    print("El tipo de triángulo es: Obtusángulo")

if angulo1 < 90 and angulo2 < 90 and angulo3 and 90:
    print("El tipo de triángulo es: Acutángulo")

