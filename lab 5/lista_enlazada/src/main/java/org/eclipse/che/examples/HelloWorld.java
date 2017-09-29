package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String... argvs) {
        //Lista enlazada simple que puede ser recorrida de la cabeza a la cola
        //Objetos que apuntan a otros
        Node a = new Node();
        a.setPropiedad("GUA");
        
        Node b = new Node();
        b.setPropiedad("MEX");
        a.setNext(b);
        
        Node c = new Node();
        c.setPropiedad("USA");
        a.getNext().setNext(c);
        
        Node d = new Node();
        d.setPropiedad("ESP");
        a.getNext().getNext().setNext(d);
        
        System.out.println(a.getPropiedad());
        System.out.println(a.getNext().getPropiedad());
        System.out.println(a.getNext().getNext().getPropiedad());
        System.out.println(a.getNext().getNext().getNext().getPropiedad());
        
        System.out.println("     ");
         //Implementación con la clase SingleLinkedList
        SingleLinkedList lista = new SingleLinkedList();
        lista.addFirst("GUA");
        lista.addLast("MEX");
        lista.addLast("USA");
        lista.addLast("FRA");
        lista.addLast("ITA");
        lista.addLast("RUS");
        lista.addLast("SUI");
        lista.addLast("CHI");
        lista.addLast("JAP");
        lista.addLast("COL");
        
        System.out.println(lista.first());
        System.out.println(lista.last());
        
        String valor = lista.removeFirst();
        while(valor != null){
            System.out.println(valor);
            valor = lista.removeFirst();
        }
        
    }
    
    /**
     * Inner class Nodo
     */
    private static class Node{
        private String propiedad;
        private Node next;
        
        private String getPropiedad(){
            return this.propiedad;
        }
        private void setPropiedad(String propiedad){
            this.propiedad = propiedad;
        }
        private Node getNext(){
            return this.next;
        }
        
        private void setNext(Node next){
            this.next = next;
        }
        
       
        
        
    }
}
