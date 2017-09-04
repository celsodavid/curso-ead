#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int n;
	int x;
	
	printf("Digite o valor de n: ");
	scanf("%d", &n);
	
	printf("Digite o valor de x: ");
	scanf("%d", &x);
	
	// Estruturas de decisao
	// Colocar os numeros inseridos pelo usuario em ordem crescente
	if (n==x) {
		printf("O numeros sao iguais!");
	} else if (n>x) {
		printf("%d %d", x, n);
	} else {
		printf("%d %d", n, x);
	}
	
	return 0;
}
