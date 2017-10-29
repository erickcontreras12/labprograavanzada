

public class EnhancedPositionalLinkedList<E> implements PositionalLinkedList<E>{
	
	private static class Node<E> implements Position<E>{
		private E element;
		private Node<E> next;
		private Node<E> prev;
		
		public Node(E e, Node<E> p, Node<E> n){
			element = e;
			prev = p;
			next = n;
		}
		
		public E getElement() throws IllegalStateException {
			if (next == null) // Nodo no valido
				throw new IllegalStateException("Posicion invalida");
			return element;
		}
		
		public void setElement(E e) {
			element = e;
		}

		public Node<E> getPrev() {
			return prev;
		}

		public void setPrev(Node<E> prev) {
			this.prev = prev;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}
	}
	
	private int size;
    private Node<E> header;
    private Node<E> trailer;
    
    private Node<E> validate(Position<E> p) throws IllegalArgumentException {
	if (!(p instanceof Node)){
		throw new IllegalArgumentException("P invalido");
        }
	Node<E> node = (Node<E>) p;
	if (node.getNext() == null){
		throw new IllegalArgumentException("p ya no se encuentra en la lista");
        }
	return node;
    }
    
    private Position<E> position(Node<E> node) {
	if (node == header || node == trailer){
            return null;
        }
	return node;
	}
    
    public EnhancedPositionalLinkedList(){
        size = 0;
        header = new Node(null, null, null);
        trailer = new Node(null, header, null);
        header.setNext(trailer);
    }
    
    
    
    @Override
    public int size(){
        return size;
    }
    
    @Override
    public boolean isEmpty(){
        return size==0;
    }
    
    @Override
    public Position<E> first(){
        return position(header.getNext());
    }
    
    @Override
    public Position<E> last(){
        return position(trailer.getPrev());
    }
       
    public Position<E> addBetween(E e, Node<E> pred, Node<E> suc){
        Node<E> newest = new Node(e,pred,suc);
        pred.setNext(newest);
        suc.setPrev(newest);
        size++;
        return newest;
    }
    
    @Override
    public Position<E> addFirst(E e){
        return addBetween(e, header, header.getNext());
    }
        
    @Override
    public Position<E> addLast(E e){
            return addBetween(e, trailer.getPrev(), trailer);
    }
       
    public Position<E> before(Position<E> p) throws IllegalArgumentException {
	Node<E> node = validate(p);
	return position(node.getPrev());
    }

    public Position<E> after(Position<E> p) throws IllegalArgumentException {
	Node<E> node = validate(p);
	return position(node.getNext());
    }
        
    public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException{
        Node<E> node = validate(p);
	return addBetween(e, node.getPrev(), node);
    }
	
    public Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException{ 
        Node<E> node = validate(p);
	return addBetween(e, node, node.getNext());
    }
        
    @Override
    public E set(Position<E> p, E e) throws IllegalArgumentException{
        Node<E> node = validate(p);
	E answer = node.getElement();
        node.setElement(e);
	return answer;
    }
        
    @Override
    public E remove(Position<E> p) throws IllegalArgumentException{
        Node<E> node = validate(p);
	Node<E> predecessor = node.getPrev();
	Node<E> successor = node.getNext();
	predecessor.setNext(successor);
	successor.setPrev(predecessor);
	size--;
	E answer = node.getElement();
	node.setElement(null);
	node.setNext(null);
	node.setPrev(null);
	return answer;
    }

    @Override
    public E removeFirst() {
    	if(header.getNext() == null) {
    		return null;
    	}else {
    		return remove(header.getNext());
    	}
    	
    }
    
    public Position<E> search(E value){
    	Node<E> temp = new Node(value, null, null);
    	return position(temp);
    }
    
    public Position<E> addBefore(Position<E> p, PositionalLinkedList<E> sublist){
    	Position<E> temp = null;
    	while(sublist.removeFirst() != null) {
    		temp = addBefore(p, sublist.removeFirst());
    	}
    	return temp;
    }
    
    public Position<E> addAfter(Position<E> p, PositionalLinkedList<E> sublist){
    	Position<E> temp = null;
    	Position<E> aux = null;
    	while(sublist.removeFirst() != null) {
    		temp = addAfter(p, sublist.removeFirst());
    		if(temp == null) {
    			break;
    		}
    		aux = temp;
    	}
    	return aux;
    }
    
    public Position<E> addFirst(PositionalLinkedList<E> sublist){
    	Position<E> temp = null;
    	while(sublist.removeFirst() != null) {
    		temp = addFirst(sublist.removeFirst());
    	}
    	return temp;
    }
    
    public Position<E> addLast(PositionalLinkedList<E> sublist){
    	Position<E> temp = null;
    	while(sublist.removeFirst() != null) {
    		temp = addLast(sublist.removeFirst());
    	}
    	return temp;
    }
    
    public int distance(Position<E> a, Position<E> b) {
    	int d = 0;
    	Node<E> temp1 = validate(a);
    	Node<E> temp2 = validate(b);
    	//Por si lo encuentra adelante
    	do {
    		d++;
    		temp1 = temp1.getNext();
    		if(temp1.getNext()==null) {
    			d = 0;
    			break;
    		}
    	}while(temp1 != temp2);
    	
    	//Por si esta atras;
    	do {
    		d++;
    		temp1 = temp1.getPrev();
    		if(temp1.getPrev()==null) {
    			d = 0;
    			break;
    		}
    	}while(temp1 != temp2);
    	
    	return d;
    }
}
