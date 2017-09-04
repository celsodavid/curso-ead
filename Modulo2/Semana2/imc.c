#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	float peso, altura, imc;
	
	printf("Digite o peso: ");
	scanf("%f", &peso);
	
	printf("Digite a altura: ");
	scanf("%f", &altura);

	imc = peso / (altura * altura);
	
	printf("IMC: %f\n", imc);
	
	if (imc < 17) {
		printf("Voce esta abaixo do peso ideal!");
	} else if (imc >= 17 && imc <= 18.49) {
		printf("Abaixo do peso!");
	} else if (imc >= 18.50 && imc <= 24.99) {
		printf("Parabens! Voce esta no peso normal!");
	} else if (imc >= 25 && imc <= 29.99) {
		printf("Voce esta acima do seu peso (sobrepeso)!");
	} else if (imc >= 30.0 && imc <= 34.99) {
		printf("Obesidade grau 1!");
	} else if (imc >= 35.0 && imc <= 39.99) {
		printf("Obesidade grau 2!");
	} else if(imc >= 40) {
		printf("Obesidade grau 3!");
	}
	
	return 0;
}
