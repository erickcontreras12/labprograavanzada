
package com.mycompany.labfinal_erickcontreras1009017;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author t203
 */
public class Main {

    public static void main(String[] args) throws IOException {
        FileLoader fileManager = new FileLoader();
        Scanner lectura = new Scanner(System.in);
        //C:\\Users\\Erick Contreras\\Desktop\\prueba.txt
        String ruta = "";
        String texto = "";
        System.out.println("Ingrese la ruta del archivo que desea leer");
        ruta = lectura.nextLine();
        texto = fileManager.leerArchivo(ruta);
        System.out.println("\nIngrese la ruta del archivo que desea escribir");
        //"C:\\Users\\Erick Contreras\\Desktop\\salida.txt"
        texto += "\nErick Contreras \n1009017";
        ruta = lectura.nextLine();
        fileManager.escribirArchivo(texto, ruta);
        
        
        GraphViz grafo = new GraphViz();
        grafo.createDemoGraph();
    }
    
}
