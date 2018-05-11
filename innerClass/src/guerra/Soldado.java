package guerra;

public class Soldado {
	private int sangre;
	private int agujeros;

	public Soldado() {
		this.sangre = 5000;
		this.agujeros = 0;
	}

	public void recibirDisparo() {
		Estado aux;
		switch (this.agujeros) {
		case 0: aux = new Saludable();
			break;
		case 1: aux = new Herido();
			break;
		default: aux = new Muerto();
			break;
		}
		aux.recibirDisparo();
	}

	public void recibirCuracion() {
		Estado aux;
		switch (this.agujeros) {
		case 0: aux = new Saludable();
			break;
		case 1: aux = new Herido();
			break;
		default: aux = new Muerto();
			break;
		}
		aux.recibirCuracion();
	}

	/////////////////////////////////////////////////////
	final class Saludable extends Estado {
		
		public void recibirDisparo() {
			System.out.println("uhhh yo estaba saludable");
			agujeros += 1;
			sangre -= 100;
		}

		public void recibirCuracion() {
			System.out.println("Gracias pero ya estoy saludable");
		}
	}
	/////////////////////////////////////////////////////
	final class Herido extends Estado {
		
		public void recibirDisparo() {
			System.out.println("AAAHHH yo estaba herido");
			agujeros += 1;
			sangre /= 2;
		}

		public void recibirCuracion() {
			System.out.println("Gracias, eso me vino de 10");
			agujeros-= 1;
		}
	}
	/////////////////////////////////////////////////////
	final class Muerto extends Estado {
		
		public void recibirDisparo() {
			System.out.println("Ya esta muerto");
			agujeros += 1;
		}

		public void recibirCuracion() {
			System.out.println("revivi!");
			agujeros = 0;
			sangre = 5000;
		}
	}
	/////////////////////////////////////////////////////
}