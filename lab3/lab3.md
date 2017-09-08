# lab3
## Preguntas de laboratorio
- ¿Que es una interfaz?
> Una interfaz es un tipo de "clase" en el que se generan métodos que serán parte de clases de objetos creadas despues. Así que a cuentas resumidas es una clase abstracta.
- ¿Que es una clase abstracta?
> Una clase que declara la existencia de métodos pero no la implementación de dichos métodos.
- ¿Que diferencia hay entre herencia e interfaces?
> En la herencia se utiliza la palabra "extends" al querer usar este tipo de reutilización de código lo que hace que una clase pueda obtener las características de una clase superior. El polimorfismo utiliza la palabra "implements" lo que hace que una clase obtenga los métodos establecidos en una clase abstraca y tiene que cumplir con todos los métodos que está tenga.
- ¿Cual es la diferencia entre pila, cola y lista?
> Las tres son tipos de arreglos y lo que cambia entre ellos son las sentencias para utilizar cada una. Y el orden en como entran y se obtienen los valores ingresados dentro de cada arreglo.
## Documentación
### Clase Shape
Está clase es solo una clase abstracta que contiene dos métodos sin una acción directa.

    public interface Shape {
    
      public double getArea();
      public String toString();
    }
### Clase Rectangle
Al inicializar está clase se agrega la sentencia "implements Shape", para que la clase pueda tomar la forma de Shape, es decir, utilizar los métodos que tiene Shape a su propia conveniencia

    public class Rectangle implements Shape{

Utiliza el método getArea() pidiendo como parametros dos variables de tipo double para definir la base y la altura del rectangulo y así calcular su área mediante el producto de estas dos variables. Y el método toString() nos devuelve un texto en el que se imprimen las dimensiones del rectanguo y su área.

    public double getArea(){
        return length*width;
    }
    
    public String toString(){
        return "Rectangle[width: "+width+" length:" +length+" area:"+ getArea() +"]";
    }
    
### Clase Triangle
 
Funciona de igual forma que la clase Rectangle.java con el cambio que usa los parametros del método getArea() base y height para la base y altura del triangulo respectivamentey calcularlo según la formula del triangulo y en el método toString() devolviendo las dimensiones del triangulo y su área.
 
    public Triangle(double b, double h){
        this.base = b;
        this.height = h;
    }
    public double getArea(){
        return base*height*0.5;
    }
    
    public String toString(){
        return "Triangle[base: "+base+" height:" +height+" area:"+ getArea() +"]";
    }
