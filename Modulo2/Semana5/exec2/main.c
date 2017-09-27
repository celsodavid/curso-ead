#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int maiorNumero(int n1, int n2) {
	int res = -1;
	if (n1 > n2) {
		res = n1;
	}
	
	if (n2>n1) {
		res = n2;
	}
	
	return res;
}

int main(int argc, char *argv[]) {
	int cont;
	for (cont=0; cont<5; cont++) {
		int num1, num2;
		
		printf("Digite um numero: ");
		scanf("%d", &num1);

		printf("Digite outro numero: ");
		scanf("%d", &num2);
		
		int res = maiorNumero(num1, num2);
		
		if (res == -1)
			printf("Eles sao iguais!\n\n");
		else	
			printf("O maior numero eh: %d\n\n", res);			
	}
	
	return 0;
}
