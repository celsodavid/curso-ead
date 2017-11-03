#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int x;
	printf("Digite um numero: ");
	scanf("%d", &x);
	
	if (x>0 && x<10) {
		printf("Voce entrou na PARTE 1 do codigo");
	} 
	
	if (x<=0 && x>-10) {
		printf("Voce entrou na PARTE 2 do codigo");
	}
	
	if (x>=10) {
		printf("Voce entrou na PARTE 3 do codigo");
	}
	
	/* I, II, III */
	
	return 0;
}
