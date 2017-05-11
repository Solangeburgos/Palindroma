package palindromo;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreaArchivo {


	 public static void main(String[] args) throws IOException {
	 
	     String miPath = "\\C:\\Users\\Solange y Martin\\workspace\\";
	 
	     PrintWriter salida = new PrintWriter(new FileWriter(miPath+"palin.out"));  //  preparo el arch de salida
	      
	     String z="hola";
	     String s="Saludo:" ;
	     salida.print(s);      
	     salida.println(" :"+z); 
	      salida.close(); 
	 }
	}


