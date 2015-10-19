package automat;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitsTestAfBilletautomat {

	@Test
	public void testGetBilletpris() {
		Billetautomat automat = new Billetautomat();
		assertEquals(10, automat.getBilletpris());
	}
	
	@Test
	public void testReturErNulHvisManIkkeHarSatPengeInd() {
		Billetautomat automat = new Billetautomat();
		automat.udskrivBillet();
		assertEquals(0, automat.returpenge());
		

		
	
		
		
	}

}
