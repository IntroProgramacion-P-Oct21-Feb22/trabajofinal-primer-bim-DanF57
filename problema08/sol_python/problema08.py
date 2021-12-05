bandera = "Si"
cadena_1 = " "
while( bandera == "Si"):

    medida_metros = float(input("Ingresar una medida en metros: "))
    if(medida_metros < 0):
        print("Solamente se permite valores positivos y números")

    yardas = (medida_metros * 1)/0.9144

    pulgadas = (medida_metros * 39.3701)/1

    pies = (medida_metros * 3.28084)/1
    
    cadena_2 = ("|  Metros  |  yardas  |  Pulgadas  |  Pies   |")
    cadena_1 = ("%s\n|    %s   |   %.2f   |   %.2f   |   %.2f   |"
                %(cadena_1, medida_metros, yardas, pulgadas, pies))
    
    bandera = input("Si desea seguir ingresando datos escribir [Si]: ")
cadena_final = ("%s%s"%(cadena_2,cadena_1))
print(cadena_final)
