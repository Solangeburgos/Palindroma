package filaAlumnos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;


public class Alumnos {
	
  public static void main(String[] args) throws IOException {
		
		String miPath = "\\C:\\Users\\Solange y Martin\\workspace\\Fila_de_alumnos\\Lote de prueba\\";
		
		Scanner sc = new Scanner(new File(miPath+"escolar.in"));
		Scanner sa = new Scanner(new File(miPath+"escolar.in"));
		PrintWriter salida = new PrintWriter(new FileWriter(miPath+"escolar.out"));  
		
		sc.useLocale(Locale.ENGLISH);
		int v;
		int max=0;
		int min=9999;
		int i=0;
		int acum=0;
		int pos=0;
		int dif=0;
		int b;
		b=sa.nextInt();
		while ((v=sc.nextInt()) !=0) {
			 System.out.println(v);
			 b=sa.nextInt();
			 System.out.println(b);
			 acum=acum+v;
				i++;
				  if (v>max){
					  max=v;
				  }
				  else {
					  if (v<min){
						  min=v;
						  pos=i;
					  }  
				  }
			if (dif<(Math.abs(v-b))){
				dif=(Math.abs(v-b));
				System.out.println("dif "+dif);
			} 
		}
		  int dife=dif;
		  int prom=acum/i;
		  int cant=i;
		  int mx=max ;
		  int mn=min;
		  int p=pos;
		  salida.println(""+cant);
		  salida.println(""+mx);
		  salida.println(""+mn+" "+p);
		  salida.println(""+dife);
		  salida.println(""+prom);
		 sc.close();
		 salida.close();
}
}

