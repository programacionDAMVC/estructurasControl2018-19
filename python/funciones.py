#En java sería: public static int factorial(int numero) { ....
def factorial(numero):
    contador   = 1
    acumulador = 1
    while(contador <= numero):
        acumulador *= contador
        contador += 1
    return acumulador

#En java: public static void divisiblesPorDosYTres(int numero)
def divisiblePorSeis(numero):
    for i in range(1, numero):
        if i % 2 == 0 and i % 3 == 0:
            print (i , ' es divisible por 2 y 3')
        else:
            print(i, ' NO es divisible por 2 y 3')

