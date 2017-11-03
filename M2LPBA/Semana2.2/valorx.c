#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int x;
	
	printf("Digite um numero: ");
	scanf("%d", &x);
	
	/* opcaoo a
	if (x<0) {
   		printf("O valor eh maior que zero");
	} else {
	   	printf("O valor eh igual ou menor que zero");
	}
	*/

	/* opcaoo b 
	if (x<=0) {
	   	printf("O valor eh maior que zero");
	} else {
	   	printf("O valor eh igual ou menor que zero");
	}
	*/
	
	/* opcao c */
	if (x>0) {
	   	printf("O valor eh maior que zero");
	} else {
	   	printf("O valor eh igual ou menor que zero");
	}
	
	
	/* opcao d 
	if (x==0) {
	   	printf("O valor eh igual que zero");
	} else {
	   	printf("O valor eh menor que zero");
	}
	*/
	return 0;
}
