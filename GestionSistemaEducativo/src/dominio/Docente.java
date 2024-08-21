package dominio;

public class Docente {

	private String nombreDocente;
	private int dniDocente;
	private NivelesEducativos[] especializacionNiveles;
	
	public Docente(String nombre, int dni) {
		this.nombreDocente = nombre;
		this.dniDocente = dni;
	}

	public void agregarNivelAlDocente(NivelesEducativos nivel) {
		boolean nivelAgregado = false;
		
		for(int i = 0; i < NivelesEducativos.values().length; i++) {
			if((especializacionNiveles[i] == null || especializacionNiveles.length == 0) && !nivel.equals(NivelesEducativos.values()[i])) {}
		}
		
	}
	
//	public boolean encontrarNivelEnElDocente(NivelesEducativos nivel) {
//		boolean encontrado = false;
//		
//		for(int i = 0; i < especializacionNiveles.length; i++) {
//			if(especializacionNiveles[i] != null && especializacionNiveles[i].) {
//				
//			}
//		}
//	}
	
	public String getNombreDocente() {
		return nombreDocente;
	}

	public int getDniDocente() {
		return dniDocente;
	}
	
}
