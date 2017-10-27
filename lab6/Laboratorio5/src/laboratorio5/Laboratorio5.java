/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio5;

/**
 *
 * @author t203
 */
public class Laboratorio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedPositionalList<String> lista = new LinkedPositionalList();
        Position<String> p0, p1, p2, p3, p4, p5, p6, p7;
        
        p0 = lista.addFirst("g");
        p1 = lista.addAfter(p0,"f");
        p2 = lista.addAfter(p1,"b");
        p3 = lista.addAfter(p2, "c");
        p4 = lista.addAfter(p3, "d");
        p5 = p3;
        p7 = p2;
        p2 = p4;
        p3 = p2;
        p6 = lista.addAfter(p3, "e");
        
        System.out.println("Punteros");
        System.out.println(p1.getElement());
        System.out.println(p2.getElement());
        System.out.println(p3.getElement());
        System.out.println("------------------");
        System.out.println("Listado");
        System.out.println(p0.getElement());
        System.out.println(p1.getElement());
        System.out.println(p7.getElement());
        System.out.println(p5.getElement());
        System.out.println(p4.getElement());
        System.out.println(p6.getElement());
        
        
    }
    
}
