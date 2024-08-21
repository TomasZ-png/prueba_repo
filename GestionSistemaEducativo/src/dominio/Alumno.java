package dominio;

public class Alumno {

	private String nombreAlumno;
	private String apellidoAlumno;
	private int edadAlumno;
	private int dniAlumno;
	private int[] materiasAprobadasPrimaria;
	private int[] materiasAprobadasSecundaria;
	
	public Alumno(String nombre, String apellido, int edad, int dni) {
		this.nombreAlumno = nombre;
		this.apellidoAlumno = apellido;
		this.edadAlumno = edad;
		this.dniAlumno = dni;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getApellidoAlumno() {
		return apellidoAlumno;
	}

	public void setApellidoAlumno(String apellidoAlumno) {
		this.apellidoAlumno = apellidoAlumno;
	}

	public int getEdadAlumno() {
		return edadAlumno;
	}

	public void setEdadAlumno(int edadAlumno) {
		this.edadAlumno = edadAlumno;
	}

	public int getDniAlumno() {
		return dniAlumno;
	}

	public void setDniAlumno(int dniAlumno) {
		this.dniAlumno = dniAlumno;
	}

	@Override
	public String toString() {
		return "Alumno [nombreAlumno=" + nombreAlumno + ", apellidoAlumno=" + apellidoAlumno + ", edadAlumno="
				+ edadAlumno + ", dniAlumno=" + dniAlumno + "]";
	}
	
}
