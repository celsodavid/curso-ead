#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	void imprimeMensagem(void); // declarando a funcao
	
	imprimeMensagem();
	return 0;
}

void imprimeMensagem(void) {
	printf("Por padrao de desenvolvimento, devemos sempre declarar as funcoes!");
}
