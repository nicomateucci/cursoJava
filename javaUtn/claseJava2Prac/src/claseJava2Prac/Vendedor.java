package claseJava2Prac;

import java.util.Scanner;

public class Vendedor extends Empleado
{
	
	private float porcenComision, totalVentas;

	public float getPorcenComision() {
		return porcenComision;
	}
	public void setPorcenComision(float porcenComision) {
		this.porcenComision = porcenComision;
	}
	public float getTotalVentas() {
		return totalVentas;
	}
	public void setTotalVentas(float totalVentas) {
		this.totalVentas = totalVentas;
	}

	public void cargarDatos()
	{
		Scanner s = new Scanner(System.in);
		
		String dato;
		
		super.cargarDatos();
		System.out.println("Ingrese el porcentaje de comision: ");
		dato = s.nextLine();
		this.setPorcenComision(Integer.parseInt(dato));
		System.out.println("Ingrese el total de ventas: ");
		dato = s.nextLine();
		this.setTotalVentas(Integer.parseInt(dato));
		
		s.close();
	}
}
