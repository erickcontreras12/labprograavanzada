# Lab4
El lenguaje utilizado durante este laboratorio es C++ con la herramiente en línea EclipseChe
    
## Prototipos Calculadora por valor 
Dentro de C++ es necesario declarar los métodos utilizados antes del método principal que en este caso es el método int Main()
pero se puede obviar el desarrollar los métodos antes del principal utilizando los llamados prototipos que hacen un tipo de instancia a
los métodos que se utilizaran.

    int sumar(int,int);
    int restar(int,int);
    int multiplicar(int,int);
    double dividir(int,int);

## Operaciones por valor
Los prototipos de la calculador de valor hacen una llamada a los métodos que se encuentran abajo y hacen operaciones básicas de aritmética como lo son la suma, resta, multiplicacion y división.

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


## Prototipos Calculadora punteros
     void sumaPunteros(int,int,int*);
     void restaPunteros(int,int,int*);
     void multiplicacionPunteros(int,int,int*);
     void divisionPunteros(int,int,int*);

## Operaciones por referencia
Las operaciones por referencia reciben un parámetro extra que es de tipo 'int*' que es un llamado a un puntero para cambiar el valor de una variable ya inicializada haciendo llamado a la dirección de memoria donde se encuentra la variable. 

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

## Main
En el main inicializo la variable de tipo entero denominada 'resultado' para tener una variable donde almacenar la respuesta a la
operación que realice cada uno de los métodos. Como las operaciones por sus tipos de métodos son parte de un lenguaje de paso por valor 
es necesario igualar la variable 'resultado' a cada uno de métodos declarados que son de tipo entero.
 
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
  
Ahora dentro de los métodos que utiliza por referencia hago una llamada con "&" a la variable 'resultado' para modificar su valor sin necesidad de igualar el método a la variable. 
  
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
  
 El método Main es de tipo entero y devuelve un 0 para rectificar que todo está bien y no hay errores de sintaxis o compilación. Si los hubiera el método puede retornar un 1 o -1. 
  
          return 0;
     }

