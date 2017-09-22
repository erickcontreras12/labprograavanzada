// Simple Hello World
 
#include <iostream>
//Prototipos Calculadora por valor 
int sumar(int,int);
int restar(int,int);
int multiplicar(int,int);
double dividir(int,int);

//Prototipos Calculadora punteros
void sumaPunteros(int,int,int*);
void restaPunteros(int,int,int*);
void multiplicacionPunteros(int,int,int*);
void divisionPunteros(int,int,int*);

//Prototipo Tabla de multiplicar
void arregloTablaMultiplicar(int);

//Main donde se implementa todo
int main()
{
  //Calculadora por Valor (Utilizando métodos por valor)
  int resultado = sumar(7,5);
  std::cout << "Por Valor" << std::endl;
  std::cout << resultado << std::endl; 
  resultado = restar(7,5);
  std::cout << resultado << std::endl; 
  resultado = multiplicar(5,7);
  std::cout << resultado << std::endl; 
  double resultado1 = dividir(7,5);
  std::cout << resultado1 << std::endl; 
  
  //Calculadora por Punteros (Utilizando métodos por referencia)
  std::cout << " " << std::endl;
  std::cout << "Por Referencia" << std::endl;
  sumaPunteros(8,5,&resultado);
  std::cout << resultado << std::endl;
  restaPunteros(8,5,&resultado);
  std::cout << resultado << std::endl;
  multiplicacionPunteros(8,5,&resultado);
  std::cout << resultado << std::endl;
  divisionPunteros(8,5,&resultado);
  std::cout << resultado << std::endl;
  
  std::cout << " " << std::endl;
  std::cout << "Tabla de multiplicar" << std::endl;
  arregloTablaMultiplicar(1);
  return 0;
}

//Operaciones por valor
int sumar(int a,int b){
    return a+b;
}
double dividir(int a,int b){
    return a/b;
}
int restar(int a,int b){
    return a-b;
}
int multiplicar(int a,int b){
    return a*b;
}


//Operaciones por referencia
void sumaPunteros(int a, int b,int* resultado){
    *resultado = a+b;
}
void restaPunteros(int a, int b,int* resultado){
    *resultado = a-b;
}
void multiplicacionPunteros(int a, int b,int* resultado){
    *resultado = a*b;
}
void divisionPunteros(int a, int b,int* resultado){
    *resultado = a/b;
}

//Método arreglo para tabla de multiplicar
void arregloTablaMultiplicar(int a){
    int arreglo[10];
    
}