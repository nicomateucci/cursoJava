package claseJava2Prac;

public class Administrativo extends Empleado
{
	private float hsExtra, hsMes;

	public float getHsExtra() {
		return hsExtra;
	}
	public void setHsExtra(float hsExtra) {
		this.hsExtra = hsExtra;
	}

	public float getHsMes() {
		return hsMes;
	}

	public void setHsMes(float hsMes) {
		this.hsMes = hsMes;
	}
	
	public double getSueldo()
	{
		return this.getSueldoBase() * ((hsExtra * 1.5)+hsMes) / hsMes;
	}
	
	/*public void cargaDatos()
	{
		
		// Mal --------------------------------------------------------------------------
		
		Scanner s = new Scanner(System.in);
		String dato; 
		
		super.cargarDatos();
		System.out.println("Ingrese la cantidad de horas extras del mes: ");
		dato = s.nextLine();
		this.setHsExtra(Integer.parseInt(dato));
		System.out.println("Ingrese la cantidad de horas que trabajo en el mes: ");
		dato = s.nextLine();
		this.setHsMes(Integer.parseInt(dato));
		
		s.close();
	}*/
	
}
