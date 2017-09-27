#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
/* exec 3 */
/* Resposta: O somatorio eh: 5 */
int main(int argc, char *argv[]) {
	int n = 0;
	int somatorio=0;
	
	while (n>=0){
	  	printf ("Digite um numero: ");
	  	scanf ("%d", &n);
	
	  	if (n>=0)
	    	somatorio = somatorio + n;
	}
	
	printf ("O somatorio eh: %d", somatorio);
	return 0;
}
