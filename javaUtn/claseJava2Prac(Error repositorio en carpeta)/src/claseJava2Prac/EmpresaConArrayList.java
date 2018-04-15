package claseJava2Prac;

import java.util.Scanner;
import java.util.ArrayList;

public class EmpresaConArrayList
{

	private static ArrayList<Empleado> empleados;
	public static Scanner s;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i = 0;
		int continuar = 0; 
		empleados = new ArrayList<Empleado>();
		s = new Scanner(System.in);
		
		while (continuar == 0 && i < 20)
		{
			String opc = "";
			System.out.println("Programa hacho con ArrayList");
			System.out.println("Ingrese los datos del nuevo empleado: (Limite 20, van: " + i +  ") ");
			System.out.println("");
			System.out.println("El empleado es un vendedor o un administrativo ?");
			System.out.println("Ingrese una V o una A respectivamente");
			opc = s.nextLine();
			if (opc.equals("V") || opc.equals("v"))
			{
				Vendedor vend = new Vendedor();
				EmpresaConArrayList.cargaVendedor(vend);
				empleados.add(vend);
			}
			else
			{
				Administrativo admin = new Administrativo();
				EmpresaConArrayList.cargaAdministrativo(admin);
				empleados.add(admin);
			}
			i++;

			do
			{
				System.out.println("Quiere seguir ingresando personas ?");
				System.out.println("0-Si ");
				System.out.println("1-No");
				continuar = Integer.parseInt(s.nextLine());
			}while (continuar != 0 && continuar != 1);
		}
		EmpresaConArrayList.mostrarDatos();
		
		
		s.close();
	}
	public static void cargaEmpleado(Empleado emp) 
	{
		System.out.println("Ingrese el nombre del empleado: ");
		emp.setNombre(s.nextLine());
		
		System.out.println("Ingrese el apellido del empleado: ");
		emp.setApellido(s.nextLine());
		
		System.out.println("Ingrese el dni del empleado");
		emp.setDni(s.nextLine());
		
		System.out.println("Ingrese el email de la persona: ");
		emp.setEmail(s.nextLine());
		
		System.out.println("Ingrese el sueldo base del empleado");
		emp.setSueldoBase(Integer.parseInt(s.nextLine()));
		
		
	}
	public static void cargaVendedor(Vendedor vend)
	{
		EmpresaConArrayList.cargaEmpleado(vend);
		if (Vendedor.getPorcenComision() == 0)
		{
			System.out.println("Ingrese el porcentaje de comision para todos los vendedores");
			Vendedor.setPorcenComision(Float.parseFloat(s.nextLine()));
		}
		System.out.println("Ingrese el total de centas del mes del empleado");
		vend.setTotalVentas(Float.parseFloat(s.nextLine()));
	}
	public static void cargaAdministrativo(Administrativo admin)
	{
		EmpresaConArrayList.cargaEmpleado(admin);
		System.out.println("Ingrese la cantidad de horas trabajadas en el mes: "); 
		admin.setHsMes(Float.parseFloat(s.nextLine()));
		System.out.println("INgrese la cantidades de horas extras que trabajo en el mes: ");
		admin.setHsExtra(Float.parseFloat(s.nextLine()));
	}
	public static void mostrarDatos()
	{
		System.out.println("Lista de empleados cargados al momento: ");
		for (Empleado emp: empleados)
		{
			System.out.println("Empleado numero: " + ((empleados.indexOf(emp) + 1) + 1));
			System.out.println("Nombre: " + emp.getNombre());
			System.out.println("Apellido:" + emp.getApellido());
			System.out.println("DNI: " + emp.getDni());
			System.out.println("Sueldo base: " + emp.getSueldoBase());
			System.out.println("Sueldo del mes: " + emp.getSueldo());
			System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
		}
	}
	
}