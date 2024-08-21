package dominio;

public class Salon {
	
	private Alumno[][][] salonAlumno; 
	
	public Salon() {
		this.salonAlumno = new Alumno[5][5][5];
	}

	public Alumno[][][] getSalonAlumno() {
		return salonAlumno;
	}
	
	public Alumno[][][] mostrarMatriz(){
		return salonAlumno;
	}
	
}
