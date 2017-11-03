/*
PROBLEMA:
Fazer um algoritmo que calcule o cubo de um numero digitado pelo usuario.
	ENTRADA: 2		SAIDA: 8
	ENTRADA: 3		SAIDA: 27
	
COMANDOS ENVOLVIDOS:
		- Escreva	/	printf()
		- Leia 		/	scanf()
		- Atribuicao

PSEUDOCODIGO:

programa exemplo2
var
	n, cubo: real
inicio
	leia n
	cubo <- n ^ 3
	escreva "Cubo: ", cubo
fimprograma
*/

#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	float n, cubo;
	
	printf("Digite um numero: ");
	scanf("%f", &n);
	
	cubo = n * n * n;
	
	printf("O cubo de %.0f eh %.0f", n, cubo); // pode se usar %.0f, %.1f e %.nf
	
	return 0;
}
