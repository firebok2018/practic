package practic;

public class Agenda {
	private int id;
	private String apellidos;
	private String nombre;
	private String dirrecion;
	private int edad;
	private String fechaNac;
	
	
	public Agenda() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Agenda(int id, String apellidos, String nombre, String dirrecion, int edad, String fechaNac) {
		super();
		this.id = id;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.dirrecion = dirrecion;
		this.edad = edad;
		this.fechaNac = fechaNac;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirrecion() {
		return dirrecion;
	}
	public void setDirrecion(String dirrecion) {
		this.dirrecion = dirrecion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	

}
