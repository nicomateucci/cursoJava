package claseJava3Prac;

public class Alumno extends Persona
{
	private String legajo;
	private String ciudadNatal;
	private String[] materiasAprobadas;
	
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	public String getCiudadNatal() {
		return ciudadNatal;
	}
	public void setCiudadNatal(String ciudadNatal) {
		this.ciudadNatal = ciudadNatal;
	}
	public String[] getMateriasAprobadas() {
		return materiasAprobadas;
	}
	public void setMateriasAprobadas(String[] materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}
	
	public String toString()
	{
		return super.toString() + this.getLegajo();
	}
}
