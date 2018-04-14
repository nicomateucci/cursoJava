package claseJava4Prac;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> palabras = new ArrayList<String>();
		
		System.out.println("Palabras: ");
		System.out.println("Tamaño" + " " + palabras.size());
		System.out.println("");
		palabras.add("Esteban");
		palabras.add("Lautaro");
		palabras.add(0, "Martin");
		palabras.add("Lionel");
		palabras.add("Esteban");
		
		for(String pal: palabras)
		{
			System.out.println(pal);
		}
		
		System.out.println("Tamaño" + " " + palabras.size());
		System.out.println("");
		System.out.println("----------------------------------------------------------------");
		System.out.println("Despues del remove");
		System.out.println("");
		System.out.println("");
		
		palabras.remove("Esteban");
		
		for(String pal: palabras)
		{
			System.out.println(pal);
		}
		System.out.println("Tamaño" + " " + palabras.size());
		// Se puede agrear un objeto instanciandolo primero o directamento haciendo arra.ad(new Objeto(etc.))
		
		System.out.println("La coleccion contiene el nombre Lautaro ?" + " " + palabras.contains("Lautaro"));
		System.out.println("La coleccion contiene el nombre Lionel en la posicion: " + (palabras.indexOf("Lionel")+ 1 ));
		System.out.println("");
		
	}

}
