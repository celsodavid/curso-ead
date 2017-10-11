#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
/* exec 4 */
/* Resposta: cont < 10  */
int main(int argc, char *argv[]) {
	int cont = 0;
	while (cont<10){
	   printf ("%d ", cont);
	   cont = cont + 1;
	}
	return 0;
}
