import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;

public class EjemploComparableComparatorPorWeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Coleccion tipo: ArrayList");
		System.out.println("");
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Nico");
		nombres.add("Seba");
		nombres.add("Maria");
		nombres.add("Pia");
		nombres.add("Azul");
		System.out.println("lista original:"+nombres);
		 
		Collections.sort(nombres);
		System.out.println("lista ordenada:"+nombres);
		
		System.out.println("");
		System.out.println("Coleccion tipo: Set. Los objetos se ordenan automaticamente");
		System.out.println("Funcionan correctamente, porque cada elemento\n de las colecciones son comparables entre sí.\n Para que un objeto sea comparable\n, su clase debe implementar la interfaz java.lang.Comparable. ");
		System.out.println("");
		Set<String> otrosNombres = new TreeSet<>();
		otrosNombres.add("Xiamara");
		otrosNombres.add("Mario");
		otrosNombres.add("Fernando");
		otrosNombres.add("Omar");
		otrosNombres.add("Juana");
		otrosNombres.add("Ana");
		 
		System.out.println("Conjunto ordenado:" + otrosNombres);
		
		System.out.println("Entonces, si queremos que los objetos\n que al guardarse en una colección\n (java.util.Set o java.util.List) estén \n ordenados por el campo nombre, debemmos:");
		System.out.println("1_Implementar la interfaz Comparable");
		System.out.println("	# class Persona implements Comparable<Persona>");
		System.out.println("2_Implementar su método de comparación,\n aquí es donde definimos qué campo vamos\n a utilizar para ordenar: ");
		System.out.println(" @Override \npublic int compareTo(Persona o) {\n return this.nombre.compareTo(o.nombre);\n }\n");
		System.out.println("");
		System.out.println("Ahora, cuando usemos una colección para ordenar,\n el ordenamiento será automático: ");
		System.out.println("Ahora, siempre será ordenado por nombre");
		
		Set<Persona> personas = new TreeSet<>();
		personas.add(new Persona(1, "Mario", "Laius"));
		personas.add(new Persona(2, "Fernando", "Silvani"));
		personas.add(new Persona(3, "Omar", "Laiolo"));
		personas.add(new Persona(4, "Juana", "Cecchi"));
		 
		System.out.println("Conjunto ordenado de personas luego de implementar la interface Comparable en la clase Persona: " + personas);
		
		System.out.println("Si se quisiera ordenar por otro atributo, se debe usar la interface Comparator<...>");
		System.out.println("java.lang.Comparator");
		
		System.out.println("Un comparador es una clase de apoyo que\n será utilizada para los métodos de ordenamiento.");
		System.out.println("Lista  de personas ordenadas con la INTERFFACE Comparator");
		ArrayList<Persona> otrasPersonas = new ArrayList<Persona>();
		otrasPersonas.add(new Persona(1, "Yamil", "Zagardia"));
		otrasPersonas.add(new Persona(2, "Mario", "Bros"));
		otrasPersonas.add(new Persona(3, "Omar", "Ponce de Leon"));
		otrasPersonas.add(new Persona(4, "Juana", "Cecchi"));
		otrasPersonas.add(new Persona(5, "Victoria", "Arruabarrena"));
		otrasPersonas.add(new Persona(6, "Fernando", "Gago"));
		Collections.sort(otrasPersonas, new OrdenarPersonaPorApellidoNombre());
		System.out.println("lista de personas ordenadas por ID:" + otrasPersonas);
	
	}

}
