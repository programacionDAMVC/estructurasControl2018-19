#En java haríamos functiones.factorial(6)
from funciones import factorial, divisiblePorSeis

#En java Scanner sc = new Scanner(System.in); int numero = sc.nextInt()
numero = int(input('Introduce número: '))

print('El factorial de ', numero, ' vale ' , factorial(numero))
divisiblePorSeis(numero)
