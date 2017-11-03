#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int x, y, z, soma;
	printf("Digite o valor de um dos angulos do triangulo: ");
	scanf("%d", &x);
	
	printf("Digite o valor do segundo angulo do triangulo: ");
	scanf("%d", &y);
	
	printf("Digite o valor do terceiro angulo do triangulo: ");
	scanf("%d", &z);
	
	soma = x + y + z;
	
	// se a soma e diferente de 180
	if  (soma != 180) {
		printf("A soma dos angulos deve ser 180.");
	} else {
		if (x == 90 || y == 90 || z == 90) {
			printf("Este triangulo eh reto.");
		} else if (x > 90 || y > 90 || z > 90) {
			printf("Este triangulo eh obtuso.");
		} else {
			printf("Este triangulo eh acutangulo.");
		}
	}
	
	/* II,III,IV */
	return 0;
}
