package claseJava3Prac;

public class Persona 
{
	private String dni;
	private String nombre;
	private String apellido;
	private float peso;
	
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
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return (obj instanceof Persona)  && ((this.getNombre() == ((Persona)obj).getDni()) );
	}
	@Override
	public String toString()
	{
		return this.getClass().getName() + " " + this.getNombre() + " " + this.getApellido() + " ";
	}
}
