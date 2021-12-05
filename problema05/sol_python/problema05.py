corX = float(input("Ingrese la coordenada X: "))
corY = float(input("Ingrese la coordenda Y: "))

if corX==0 and corY==0:
    print("La coordenda esta en el centro del plano")
if corX>0 and corY>0:
    print("La cordenada se encuentra en la region superior derecha del plano")
if corX<0 and corY>0:
    print("La corrdendada se encuentra en la region superior izquierda del plano")
if corX<0 and corY<0:
    print("La cordendada se encuentra en la region inferior izquierda del plano")
if corX>0 and corY<0:
    print("La cordendada se encuentra en la region inferior derecha del plano")
