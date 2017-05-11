package TodaLaLista;

public interface Listas <T> {
	public void insertarUltimo(T x);
	public void insertarPrimero(T x);
	public void insertarMedio(int posicion, T obj);
	//public T eliminarfinal();NO LA USAMOS PORQUE ES MUY  COSTOSA DEBERIA SER DOBLEMENTE ENLAZADA PARA QUE SEA UTIL
	public T eliminarinicio();
	public T eliminarmedio();
	public boolean esVacia();
	public T getValor(int posicion) throws Exception;
	public boolean buscar(T dat);
	public int getTamanio();
}
