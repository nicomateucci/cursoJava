package claseJava2Prac;

public class Vendedor extends Empleado
{
	
	private float totalVentas;
	private static float porcenComision;


	public float getTotalVentas() {
		return totalVentas;
	}
	public void setTotalVentas(float totalVentas) {
		this.totalVentas = totalVentas;
	}
	public static float getPorcenComision() {
		return porcenComision;
	}
	public static void setPorcenComision(float porcenComision) {
		Vendedor.porcenComision = porcenComision;
	}
	public double getSueldo()
	{
		return this.getSueldoBase() + (porcenComision*totalVentas/100);
	}

	
	/*public void cargarDatos()
	{
		//Mal --------------------------------------------------------------------------
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
	}*/

}
