package TodaLaLista;

public class ListaEnlazada <T> implements Listas<T>{
	private Nodo<T> primero;
	private Nodo<T> ultimo;
	public int tamaño;
	
	public class Nodo<T>{
		private T dat;
		private Nodo<T> sig;
	
	private Nodo (T dato) {
		this.dat=dato;
		this.sig=null;
	  }
	 public T getValor() {
	        return dat;
	    }

	    public void setValor(T valor) {
	        this.dat = valor;
	    }

	    public Nodo<T> getSiguiente() {
	        return sig;
	    }

	    public void setSiguiente(Nodo siguiente) {
	        this.sig = siguiente;
	}
   public ListaEnlazada(){
	   primero=null;
	   ultimo=null;
	   tamaño=0;
   }

   public void insertarUltimo(T x){
	 Nodo <T> nuevo = new Nodo<T> (x);
	 nuevo.setValor(x);
	if (esVacia()){
	  primero=nuevo;
	 }
	else
	{
		Nodo<T> aux = primero;
        // Recorre la lista hasta llegar al ultimo nodo.
        while(aux.getSiguiente() != null){
            aux = aux.getSiguiente();
        }
        // Agrega el nuevo nodo al final de la lista.
        aux.setSiguiente(nuevo);
    }
    // Incrementa el contador de tamaño de la lista
    tamaño++;
   }
   public void insertarPrimero(T x){
	   if(esVacia()){
	   }
   }
   public T eliminarinicio() {  //Elimina el primer elemento de la lista
	   if(esVacia()){
			System.out.print("La lista esta Vacia");
		}
		else{
			Nodo<T> t = primero;
			primero= primero.sig;
			// si la lista tenía 1 elemento y ahora está vacía
			if ( primero == null ) ultimo= null;
			tamaño--;
			return t.dato;

		}
	return null;
   }
   


/*public T eliminarfinal() { //Elimina el del final de la lista pero es muy costosa de tiempo por eso no la usamos
    T borra= null;
    if(esVacia()) {
       System.out.print("La lista se encuentra vacia");
        return null;
    }
    if(primero == ultimo) {
        primero = null;
        ultimo = null;
    }
    else {
        Nodo<T> actual = primero;
        while(actual.sig != ultimo) {
            actual = actual.sig;
        }
        borra=(T) actual.sig;
        actual.sig = null;
        ultimo = actual;
    }
    this.tamaño--;
    return borra;
}*/
public boolean esVacia() {
	return primero==null;
}
public T getValor(int posicion) throws Exception{
    if(posicion>=0 && posicion<tamaño){
        if (posicion == 0) {
            // Retorna el valor del inicio de la lista.
            return (T) primero;
        }else{
            // Crea una copia de la lista.
            Nodo<T> aux = primero;
            // Recorre la lista hasta la posición ingresada.
            for (int i = 0; i < posicion; i++) {
                aux = aux.sig;
            }
            // Retorna el valor del nodo.
            return (T) aux;
        }
    // Crea una excepción de Posicion inexistente en la lista.
    } else {
        throw new Exception("Posicion inexistente en la lista.");
    }
}
public boolean buscar(T dat) {
	        Nodo <T> aux = primero;
	        boolean encontrado = false;
	        while(aux != null && encontrado != true){
	            // Consulta si el valor del nodo es igual al de referencia.
	            if (dat == aux.getValor()){
	                encontrado = true;
	            }
	            else{
	                // Avansa al siguiente. nodo.
	                aux = aux.getSiguiente();
	            }
	        }
	        // Retorna el resultado de la bandera.
	        return encontrado;
	    }

public T eliminarmedio(int posicion) {
	T x=null;
	if(esVacia()){
		System.out.print("La lista esta Vacia");
		}
	else{
		Nodo<T> temp = primero;
		Nodo<T> ant = null;
		int i = 0;
		if(posicion >= 0 && posicion <= size()){
			while(i<posicion){
            	ant = temp;
                temp = temp.sig;
                i++;
            	}           
		if(posicion==0) primero = primero.sig;
		else{
			ant.sig = temp.sig;
			x=temp.dato;
			temp=temp.sig;
		}
		return x;
	}
}

}

@Override
public void insertarMedio(int posicion, T obj) {
	// TODO Auto-generated method stub
	
}

@Override
public T eliminarmedio() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int getTamanio() {
	// TODO Auto-generated method stub
	return 0;
}
