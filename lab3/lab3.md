# lab3
## Preguntas de laboratorio
- ¿Que es una interfaz?
> Una interfaz es un tipo de "clase" en el que se generan métodos que serán parte de clases de objetos creadas despues. Así que a cuentas resumidas es una clase abstracta.
- ¿Que es una clase abstracta?
> Una clase que declara la existencia de métodos pero no la implementación de dichos métodos.
- ¿Que diferencia hay entre herencia e interfaces?
> En la herencia se utiliza la palabra "extends" al querer usar este tipo de reutilización de código lo que hace que una clase pueda obtener las características de una clase superior. El polimorfismo utiliza la palabra "implements" lo que hace que una clase obtenga los métodos establecidos en una clase abstraca y tiene que cumplir con todos los métodos que está tenga.
- ¿Cual es la diferencia entre pila, cola y lista?
>
## Documentación
### Clase Shape
Está clase es solo una clase abstracta que contiene dos métodos sin una acción directa.

    public interface Shape {
    
      public double getArea();
      public String toString();
    }
###Clase Rectangle
Al inicializar está clase se agrega la sentencia "implements Shape", para que la clase pueda tomar la forma de Shape, es decir, utilizar los métodos que tiene Shape a su propia conveniencia

