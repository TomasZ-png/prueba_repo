package dominio;

public enum MenuNiveles {

	NIVEL_JARDIN("NIVEL JARDIN"), NIVEL_PRIMARIO("NIVEL PRIMARIO"), NIVEL_SECUNDARIO("NIVEL SECUNDARIO"), SALIR("SALIR");
	
	private String descripcion;
	
	MenuNiveles(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
}
