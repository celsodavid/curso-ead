#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	//declaracao das variaveis
	float num1;
	float num2;
	float soma;
	int numInt1;
	int numInt2;
	int somaInt;
	int sub;
	int mult;
	float div;
	
	printf("Somando numeros real \n");
	printf("Digite um numero real: ");
	scanf("%f", &num1);
	
	printf("Digite outro numero real: ");
	scanf("%f", &num2);
	
	soma = num1+num2;
	printf("A soma do numero real eh %f ", soma);
	
	
	printf("\n Somando numeros inteiros \n");
	printf("Digite um numero inteiro: ");
	scanf("%d", &numInt1);
	
	printf("Digite outro numero inteiro: ");
	scanf("%d", &numInt2);
	
	somaInt = numInt1+numInt2;
	printf("A soma do numero inteiro eh %d \n", somaInt);

	sub = numInt1-numInt2;
	printf("A sub do numero inteiro eh %d \n", sub);
	
	mult = numInt1*numInt2;
	printf("A mult do numero inteiro eh %d \n", mult);
	
	div = num1/num2;
	printf("A divisao do numero eh %f ", div);
	
	return 0;
}
