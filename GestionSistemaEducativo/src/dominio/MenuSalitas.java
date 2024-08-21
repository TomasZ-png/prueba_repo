package dominio;

public enum MenuSalitas {

	SALA_CELESTE("SALA CELESTE"), SALA_VERDE("SALA VERDE"), SALA_AZUL("SALA AZUL"), SALA_ROJA("SALA ROJA"), VOLVER("VOLVER");
		
		private String descripcion;
		
		MenuSalitas(String descripcion) {
			this.descripcion = descripcion;
		}

		public String getDescripcion() {
			return descripcion;
		}
		
	}
