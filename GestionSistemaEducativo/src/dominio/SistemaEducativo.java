package dominio;

public class SistemaEducativo {
	
	Jardin jardin;
	Alumno[] alumnos;
	Docente[] docentes;
	
	public SistemaEducativo() {
		this.alumnos = new Alumno[500];
		this.docentes = new Docente[100];
		this.jardin = new Jardin();
	}
	
	public Salon[] mostrarSalon() {
		return jardin.getSalones();
	}
	
}
