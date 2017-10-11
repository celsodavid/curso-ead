#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int i, vetor[100], soma = 0;
	
	// recebendo os valores digitados pelo usuario e armazenando no vetor.
	for (i=0; i<11; i++) {
		printf("Digite um valor: ");
		scanf("%d", &vetor[i]);
	}
	
	// efetua a soma dos valores contidos no vetor.
	for (i=0; i<11; i++) {
		soma = soma + i;
	}
	
	// verifica se eh um numero negativo|positivo|zero e exibe um mensagem para o usuario
	if (vetor[10] < 0) {
		printf("O valor eh negativo!\n");
	} else if (vetor[10] > 0) {
		printf("O valor eh positivo!\n");
	} else {
		printf("O valor eh zero!\n");
	}
	
	// verifica se o valor eh um numero par
	if (vetor[10]%2 == 0) {
		printf("O valor eh par!");
	}
	
	return 0;
}
