package UserInterface;

import claseJava3Prac.*;

public class Main {
	public static void main(String[] args)
	{
		Alumno al = new Alumno();
		Persona per = new Persona();
		
		al.setNombre("Nicolas");
		al.setApellido("Mateucci");
		al.setLegajo("42868");
		al.setDni("37829123");;
		
		per.setNombre("Gustavo");
		per.setApellido("Cerati");
		per.setDni("21654987");
		
		System.out.println("Datos alumno: " + al.toString());
		System.out.println("Datos persona: " + per.toString());
		System.out.println("asdfa" == "asdfa");
	}

}
