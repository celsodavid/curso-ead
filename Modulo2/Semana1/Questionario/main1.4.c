#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	float a, b, resDivisao;
	
	a = 11;
	
	printf("\n Digite um numero para dividirmos por 11: ");
	scanf("%f", &b);
	
	resDivisao = a/b;
	
	printf("\n O resultado dessa divisao eh: %f \n", resDivisao);
	
	system("PAUSE");
	return 0;
}
