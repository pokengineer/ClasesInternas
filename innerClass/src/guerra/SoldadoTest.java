package guerra;

import static org.junit.Assert.*;

import org.junit.Test;

public class SoldadoTest {

	Soldado ryan = new Soldado();
	@Test
	public void Disparos() {
		ryan.recibirDisparo();
		ryan.recibirDisparo();
		ryan.recibirDisparo();
		ryan.recibirDisparo();
		ryan.recibirDisparo();
	}
	
	
	@Test
	public void Curacion() {
		ryan.recibirCuracion();
		ryan.recibirDisparo();
		ryan.recibirCuracion();
		ryan.recibirDisparo();
		ryan.recibirDisparo();
		ryan.recibirCuracion();
	}

}
