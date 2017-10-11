#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

float AreaTriandulo(x, y) {
	float resultado;
	
	resultado = (x * y) / 2;
	
	// return 0;
	return resultado;
}

int main(int argc, char *argv[]) {
	float base, altura, area;
	
	printf("Digite a base e a altura do triangulo:");
	
	scanf("%f",&base);
	scanf("%f",&altura);
	
	area = AreaTriandulo(base, altura);
	
	printf("A area vale: %f", altura);
	return 0;
}
