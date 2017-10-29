
public class Main {

	public static void main(String[] args) {
		EnhancedPositionalLinkedList<String> listaPrincipal = new EnhancedPositionalLinkedList<String>();
		Position<String> p0, p1, p2, p3, p4, p5;
		PositionalLinkedList<String> lista1 = new EnhancedPositionalLinkedList<String>();
		PositionalLinkedList<String> lista2 = new EnhancedPositionalLinkedList<String>();
		PositionalLinkedList<String> lista3 = new EnhancedPositionalLinkedList<String>();
		
		//Listas auxiliares
		lista1.addFirst("q");
		lista1.addFirst("p");
		lista1.addLast("r");
		
		lista2.addFirst("m");
		lista2.addLast("n");
		
		lista3.addFirst("x");
		lista3.addLast("y");
		lista3.addLast("z");
		
		//Lista Principal
		p0 = listaPrincipal.addFirst("a");
		p1 = listaPrincipal.addAfter(p0, "b");
		p2 = listaPrincipal.addAfter(p1, "c");
		
		System.out.println(listaPrincipal.distance(p1, p0));
		
		p3 = listaPrincipal.addAfter(p0, lista1);
		p4 = listaPrincipal.addFirst(lista2);
		p5 = listaPrincipal.addLast(lista3);
		
		System.out.println("Lista");
		System.out.println("-----------------");
		String valor = "";
		do {
			valor = listaPrincipal.removeFirst();
			System.out.println(valor);
		}while(valor!=null);
	}

}
