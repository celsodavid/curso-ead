// bibliatecas
#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	// declaracao da variavel do tipo inteira chamada numero
	int numero;
	
	// comando para imprimir na tela uma mensagem solicitando ao usuario que digite uma numero 
	printf("Digite uma valor: ");
	
	// comando para capturar o valor digitado pelo usuario
	scanf("%d", &numero); // adicionar '&' para nao dar erro na captura
	
	// comando para imprimir na tela uma mensagem com o valor da variavel numero 
	printf("O numero tem como valor %d ", numero);
	
	return 0;
}
