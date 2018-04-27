import java.lang.Comparable;

import java.util.Comparator;

public class Persona implements Comparable<Persona>, Comparator<Persona> 
{
 
    private int idPersona;
    private String nombre;
    private java.util.Date fechaNacimiento;
    private String apellido;
    
    public Persona() {
    }
 
    public Persona(int idPersona, String nombre, String apellido) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
         
    }
 
    public int getIdPersona() {
        return idPersona;
    }
 
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public java.util.Date getFechaNacimiento() {
        return fechaNacimiento;
    }
 
    public void setFechaNacimiento(java.util.Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
 
    @Override
    public String toString() {
        return String.format("Persona{idPersona:%1s,nombre:%2s, apellido:%3s}", idPersona, nombre, apellido);
    }
    
    @Override
    public int compareTo(Persona o) {
        return this.nombre.compareTo(o.nombre);
    }
    
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getIdPersona() - o2.getIdPersona();
    }

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}