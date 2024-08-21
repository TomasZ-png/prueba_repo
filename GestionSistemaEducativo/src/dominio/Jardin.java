package dominio;

import java.util.Arrays;

public class Jardin {

	private Salon[] salones;
	
	public Jardin() {
		salones = new Salon[MenuSalitas.values().length];
		inicializarSalones();
	}
	
	public void inicializarSalones() {
		for(int i = 0; i < salones.length; i++) {
			salones[i] = new Salon();
		}
	}
	
	public Salon[] getSalones() {
		return salones;
	}

	public void setSalones(Salon[] salones) {
		this.salones = salones;
	}

	@Override
	public String toString() {
		return "Jardin [salones=" + Arrays.toString(salones) + "]";
	}	
	
}
