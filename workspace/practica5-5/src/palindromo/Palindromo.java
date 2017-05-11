package palindromo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Palindromo {
	public static boolean esPalindroma(String [] vec){
		int j=vec.length;
		int i=0;
		while (i<j/2){
			if (vec[i]==vec[j]){
				i++;
				j--;
			}
			else{
				return false;
			}
		}
		return true; 
		}
	public static void main(String[] args) throws IOException {
		
		String miPath = "\\C:\\Users\\Solange y Martin\\workspace\\";
		
		Scanner sc = new Scanner(new File(miPath+"palin.in"));
		sc.useLocale(Locale.ENGLISH);
		String[] vec = new String[sc.nextInt()]; 
		for (int i = 0; i < vec.length ; i++) {
			 vec[i] =sc.next() ;
			 System.out.println( vec[i]);
			 }
			 sc.close();
	    for (int i = 0; i < vec.length ; i++){
	    	if (esPalindroma(vec)){
			 
	    		PrintWriter salida = new PrintWriter(new FileWriter(miPath+"palin.out"));  //  preparo el arch de salida
	    		String z=vec[i];      
	    		salida.println(""+z); 
		        salida.close(); 
	    	}
	    	else{
	    		System.out.print("No hay palabras palindromas");
	    	}
	    }
	}
}
