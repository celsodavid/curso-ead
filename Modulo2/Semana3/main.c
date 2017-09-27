#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
/* exec 2 */
/* Resposta:  i = i + 2 */
int main(int argc, char *argv[]) {
	int i;
	for (i=0; i<=50; i=i+2) {
		printf("%d,", i);
	}
	
	return 0;
}
