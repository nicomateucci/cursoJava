package claseJava2Prac;

public abstract class Empleado {
	private String dni, nombre, apellido, email;
	private double sueldoBase;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public abstract double getSueldo();

	/*public void cargarDatos()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese dni: ");
		this.setDni(scan.nextLine());
		System.out.println("Ingrese nombre: ");
		this.setNombre(scan.nextLine());
		System.out.println("Ingrese apellido: ");
		this.setApellido(scan.nextLine());
		System.out.println("Ingrese email: ");
		this.setEmail(scan.nextLine());
		System.out.println("Ingrese sueldo base: ");
		this.setSueldoBase(scan.nextFloat());
		System.out.println();
		
		//scan.close();
	}*/
}
