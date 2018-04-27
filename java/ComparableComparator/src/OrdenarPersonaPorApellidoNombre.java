
public class OrdenarPersonaPorApellidoNombre implements java.util.Comparator<Persona>{
	
	public int compare(Persona per1, Persona per2)
	{
		String cad = per1.getApellido() + per1.getNombre();
		String cad2 = per2.getApellido() + per2.getNombre();
		
		if (cad.compareTo(cad2) < 0) 
		{
			return -1;
		}
		else if (cad.compareTo(cad2) > 0)
		{
			return 1;
		}
		else return 0;
	}
}
