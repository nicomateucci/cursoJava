package util;

import java.util.Comparator;
import entities.Persona;

public class OrdenarPersonasPorApellidoNombre implements Comparator<Persona>{

	public int compare(Persona per1, Persona per2)
	{
		String cad = per1.getApellido() + per1.getNombre();
		String cad2 = per2.getApellido() + per2.getNombre();
		
		return cad.compareTo(cad2);
		/*
		if (cad.compareTo(cad2) < 0) 
		{
			return -1;
		}
		else if (cad.compareTo(cad2) > 0)
		{
			return 1;
		}
		else return 0;
		*/
	}
}
