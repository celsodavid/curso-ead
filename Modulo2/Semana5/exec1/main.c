#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int absoluto(int n) {
	int res = n;
	if (n<0) {
		res = n * (-1);
	}
	
	return res;
}

void imprimeNumero(int n) {
	printf("O numero absoluto eh: %d\n\n", n);
}

int main(int argc, char *argv[]) {
	int cont;
	for (cont=0; cont<5; cont++) {
		int n, abs;
		
		printf("Digite um numero: ");
		scanf("%d", &n);
		
		abs = absoluto(n);
		imprimeNumero(abs);
	}
	
	return 0;
}
