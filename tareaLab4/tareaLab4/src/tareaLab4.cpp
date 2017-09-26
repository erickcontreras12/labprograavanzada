//============================================================================
// Name        : tareaLab4.cpp
// Author      : Erick Contreras
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void mostrarArreglo(int[],int);
void sumaArreglo(int[],int*);
int sumaPosicionesImpares(int[]);
int sumaPosicionesPares(int[]);
int longitudArreglo(int[]);
void ordenarAscendente(int[]);

int main() {
		int n = 0;
		int ingreso = 0;
		int resultado = 0;
		cout << "Ingrese la cantidad de numeros que desea ingresar:" << endl;
		cin >> n;
		int numeros[n];
		for(int i = 0; i < n; i++){
				cout << "Ingresando el valor: " << i << " del arreglo" << endl;
				cin >> ingreso;
				numeros[i] = ingreso;
		}

		cout << "Mostrando arreglo" << endl;
		mostrarArreglo(numeros,n);

		cout << "Suma arreglo" << endl;
		sumaArreglo(numeros,&resultado);
		cout << resultado << endl;

		resultado = sumaPosicionesPares(numeros);
		cout << "Suma posiciones pares: " << resultado << endl;
		resultado = sumaPosicionesImpares(numeros);
		cout << "Suma posiciones impares: " << resultado << endl;
		resultado = longitudArreglo(numeros);
		cout << "longitud arreglo: " << resultado << endl;

		ordenarAscendente(numeros);

		cout << "Mostrando arreglo" << endl;
		mostrarArreglo(numeros,n);
	return 0;
}

void mostrarArreglo(int  arreglo[],int l){
	for(int i = 0; i < l; i++){
		cout << arreglo[i] << endl;
	}
}

void sumaArreglo(int arreglo[], int *p){
	int suma = 0;
	for(int i = 0; i < sizeof(arreglo)/sizeof(arreglo[0]); i++){
			suma += arreglo[i];
		}
	*p = suma;
}

int longitudArreglo(int arreglo[]){
	return sizeof(arreglo)/sizeof(arreglo[0]);
}

int sumaPosicionesPares(int arreglo[]){
	int suma = 0;
	for(int i = 0; i < sizeof(arreglo)/sizeof(arreglo[0]); i++){
			if(i%2==0){
			suma += arreglo[i];
			}
		}
	return suma;
}

int sumaPosicionesImpares(int arreglo[]){
	int suma = 0;
	for(int i = 0; i < sizeof(arreglo)/sizeof(arreglo[0]); i++){
			if(i%2!=2){
			suma += arreglo[i];
			}
		}
	return suma;
}

void ordenarAscendente(int arreglo[]){
	for(int i = 0; i < sizeof(arreglo)/sizeof(arreglo[0]); i++){
		for(int j = 0; j < sizeof(arreglo)/sizeof(arreglo[0]); j++){
			if(arreglo[j] > arreglo[i]){
				int tmp = arreglo[j];
				arreglo[j] = arreglo[i];
				arreglo[i] = tmp;
			}
		}
	}
}




