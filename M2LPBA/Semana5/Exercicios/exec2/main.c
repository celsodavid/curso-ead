#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int calcula(int x, int y) {
	int soma;
	soma = x + y;
	return soma;
}

int main(int argc, char *argv[]) {
	int num1, num2, resultado;
	
	num1 = 2;
	num2 = 4;
	resultado = calcula(num1, num2);
	
	printf("O resultado vale: %d", resultado);
	return 0;
}
