package claseJava2Prac;

import java.util.Scanner;

public class Empresa {

	private Empleado[] empleados;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Empleado emple;
		
		Scanner scan = new Scanner(System.in);
		
		while (i < 20)
		{
			System.out.println("Ingrese los datos del nuevo empleado: ");
			System.out.println("");
			System.out.println("El empleado es un vendedor o un administrativo ?");
			System.out.println("Ingrese una V o una A respectivamente");
			char opc = scan.nextLine().charAt(0);
			if (opc == 'V' || opc == 'v')
			{
				emple = new Vendedor();
			}
			else
			{
				emple = new Administrativo();
			}
			emple.cargarDatos();
			
			int  opc2;
			do
			{
				System.out.println("Quiere seguir ingresando personas ?");
				System.out.println("0-Si ");
				System.out.println("1-No");
				opc2 = scan.nextInt();
				if (opc == 0)i++; else i = 20;
			}while (opc2 != 0 || opc2 != 1);
			
			
		}
		
		
		
		
		
		
		scan.close();
	}

}
