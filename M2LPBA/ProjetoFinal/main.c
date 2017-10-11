#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

// ******************************************************
// Instituto Federal de São Paulo - Campus Sertãozinho
// Disciplina......: M2LPBA - 201702
// Programação de Computadores e Dispositivos Móveis
// Aluno...........: Celso David Lopes dos Santos
//******************************************************

int main(int argc, char *argv[]) {
	// declarando as variaveis
	int i, valores[5], soma = 0, multi = 1;
	
	// recebendo os valores digitados pelo usuario e armazenando-os no vetor
	for (i=0; i<5; i++) {
		printf("Digite um numero inteiro para a posicao %d: ", i);
		scanf("%d", &valores[i]);
	}
	
	// efetua a soma e o produto dos valores do vetor preenchido
	for (i=0; i<5; i++) {
		soma = soma + valores[i];
		multi = multi * valores[i];	
	}
		
	// imprime os resultados da soma e produto e se os mesmos sao positivo ou negativo
	if (soma < 0) {
	 	printf("O resultado da soma eh %d e o numero eh negativo!\n", soma);
	} else {
		printf("O resultado da soma eh %d e o numero eh positivo!\n", soma);	
	}
	
	if (multi < 0) {
		printf("O resultado da multiplicacao eh %d e o numero eh negativo!\n", multi); 	
	} else {
		printf("O resultado da multiplicacao eh %d e o numero eh positivo!\n", multi);
	}
		
	return 0;
}
