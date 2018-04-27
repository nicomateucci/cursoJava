package UI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import entities.Persona;
import util.OrdenarPersonasPorApellidoNombre;

public class Principal {
	
	public static void main(String[] args)
	{
		HashMap<Integer, Persona> map = new HashMap<Integer, Persona>();
		
		Persona p1=new Persona(123, "Nicolas", "Mateucci");
		Persona p2=new Persona(456, "Sebastian", "Mateucci");
		Persona p3=new Persona(678, "Maria Paz", "Alvarado");
		Persona p4=new Persona(901, "Fulano", "de Tal");
		Persona p5=new Persona(901, "Daniel", "Zagardia");
		Persona p6=new Persona(908, "Frank", "Fabra");
		Persona p7=new Persona(459, "Fernando", "Gago");
		Persona p8=new Persona(124, "Jorge", "Fernandez Diaz");
		
		map.put(p1.getDni(), p1);
		map.put(p2.getDni(), p2);
		map.put(p3.getDni(), p3);
		map.put(p4.getDni(), p4);
		map.put(p5.getDni(), p5);
		map.put(p6.getDni(), p6);
		map.put(p7.getDni(), p7);
		map.put(p8.getDni(), p8);
		
		System.out.println("Size: "+map.size());
		
		System.out.println("");
		System.out.println("");
		System.out.println("foreach");
		
		for (Map.Entry ent: map.entrySet()) {
			Integer key=(Integer)ent.getKey();
			Persona per=(Persona)ent.getValue();
			System.out.println("Key: "+key+", Value: "+per);
		}
		
		Iterator it = map.keySet().iterator();
		
		System.out.println("");
		System.out.println("");
		System.out.println("while");
		
		while(it.hasNext()){
			Integer key= (Integer)it.next();
			System.out.println("Key: "+key+", Value: "+map.get(key));
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("values (Uso el HashMap como si fuera una coleccion)");
		for (Persona per : map.values()) {
			System.out.println(per);
		}
		
		System.out.println("");
		
		map.remove(678);
		printForeach(map, "removed p3");
		System.out.println("Size: "+map.size());
		
		System.out.println("");
		System.out.println("");
		System.out.println("Contains");
		System.out.println("Contains key "+p2.getDni()+"? "+map.containsKey(p2.getDni()));
		System.out.println("Contains value "+p2.getDni()+"? "+map.containsValue(p2.getDni()));
		System.out.println("Contains value p2? "+map.containsValue(p2));
		
		System.out.println("");
		System.out.println("");
		System.out.println("get");
		
		System.out.println("Persona con dni 123: "+ map.get(37829123));
		
		
		HashMap<Integer, Persona> map2= new HashMap<Integer, Persona>(map);
		
		Principal.printForeach(map2, "map2");
		
		Map<Integer, Persona> sortedMap = new TreeMap<Integer, Persona>(map2);
		Principal.printForeach(sortedMap, "Hasmap ordenado con clase TreeMap");
		
		//-----------------------------------------------
		List<Persona> auxList = new ArrayList<Persona>(map2.values());
		Collections.sort(auxList, new OrdenarPersonasPorApellidoNombre());
		//-----------------------------------------------
		
		System.out.println("map2 convertido a ArrayList y ordenado con clase Comparator() por apellido/nombre");
		for (Persona per: auxList)
		{
			System.out.println("Apellido-Nombre-Dni " + per.getApellido() + ", " + per.getNombre() + ", " + per.getDni() );
		}
	}
	
	private static void printForeach(Map<Integer, Persona> map, String title){
		System.out.println("");
		System.out.println("");
		System.out.println(title);
		for (Map.Entry entry: map.entrySet()) {
			System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
		}
	}
}
